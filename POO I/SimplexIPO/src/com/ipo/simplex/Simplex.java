package com.ipo.simplex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cern.colt.matrix.tdouble.DoubleMatrix2D;
import cern.colt.matrix.tdouble.algo.DenseDoubleAlgebra;
import cern.colt.matrix.tdouble.impl.DenseDoubleMatrix1D;
import cern.colt.matrix.tdouble.impl.DenseDoubleMatrix2D;

import com.leitor.arquivo.Arquivo;

public class Simplex {

	double[][] tableau;
	double[][] mat_basica;
	public double[] sol_basica;
	double[] simplex_mult;
	double[] custo_rel;
	double[] direcao;
	int minimo;
	int saida;
	int iteracao;
	boolean iteracaoInicial;
	public List<Integer> base;
	List<Integer> not_base;
	Arquivo arq;
	DenseDoubleAlgebra da = new DenseDoubleAlgebra();

	public boolean doSimplex(Arquivo arquivo, int max_iteracao) {
		// Passo 0
		iteracaoInicial = true;
		base = new ArrayList<Integer>();
		not_base = new ArrayList<Integer>();
		arq = arquivo;
		for (iteracao = 1; iteracao <= max_iteracao; iteracao++) {
			// Passo 1
			solucaoBasica();
			// Passo 2 e 3
			if (otimalidade())
				return true;
			// Passo 4
			if (!direcaoSimplex())
				return false;
			// Passo 5
			razaoMinima();
			// Passo 6
			novaParticao();
			iteracaoInicial = false;
		}

		return true;
	}

	private void razaoMinima() {
		saida = base.get(0);
		int pos = 0;
		double min = Double.MAX_VALUE;
		double now;
		for (Integer i : base) {
			if (direcao[pos] > 0) {
				now = sol_basica[pos] / direcao[pos];
				if (now < min) {
					saida = i;
				}
			}
		}
	}

	private boolean direcaoSimplex() {
		double[] col_a = getColumn(arq.getSujeitoA(), arq.getRestr(), minimo);
		direcao = da.mult(new DenseDoubleMatrix2D(mat_basica),
				new DenseDoubleMatrix1D(col_a)).toArray();
		for (double i : direcao) {
			if (i > 0)
				return true;
		}
		return false;
	}

	private void solucaoBasica() {
		if (iteracaoInicial) {
			for (int i = 0; i < arq.getVars(); i++) {
				int isIdentity = 0;
				for (int j = 0; j < arq.getRestr(); j++) {
					if (arq.getSujeitoA()[j][i] == 1.0) {
						isIdentity++;
					} else if (arq.getSujeitoA()[j][i] != 0.0) {
						isIdentity = 9;
						break;
					}
				}
				if (isIdentity == 1) {
					base.add(i);
				} else {
					not_base.add(i);
				}
			}
		}
		DoubleMatrix2D tmp = da.inverse(new DenseDoubleMatrix2D(
				criarMatrixBasica()));
		mat_basica = tmp.toArray();
		sol_basica = da.mult(tmp, new DenseDoubleMatrix1D(arq.getB()))
				.toArray();
	}

	private double[][] criarMatrixBasica() {
		double[][] nova = new double[arq.getRestr()][base.size()];
		int i = 0;
		for (Integer v : base) {
			for (int j = 0; j < base.size(); j++) {
				nova[j][i] = arq.getSujeitoA()[j][v];
			}
			i++;
		}
		return nova;
	}

	private void custosRelativos() {
		DenseDoubleMatrix1D custo_b = new DenseDoubleMatrix1D(base.size());
		int j = 0;
		for (Integer v : base) {
			custo_b.set(j, arq.getfObjetivo()[v]);
			j++;
		}

		simplex_mult = da.mult(new DenseDoubleMatrix2D(mat_basica), custo_b)
				.toArray();

		j = 0;
		custo_rel = new double[not_base.size()];
		for (Integer i : not_base) {
			custo_rel[j] = arq.getfObjetivo()[i]
					- da.mult(
							new DenseDoubleMatrix1D(simplex_mult),
							new DenseDoubleMatrix1D(getColumn(
									arq.getSujeitoA(), arq.getRestr(), i)));
			j++;
		}
	}

	private double[] getColumn(double[][] m, int height, int col) {
		double[] result = new double[height];
		for (int i = 0; i < height; i++) {
			result[i] = m[i][col];
		}
		return result;
	}

	private void novaParticao() {
		base.remove(base.indexOf(saida));
		base.add(minimo);
		Collections.sort(base);
		not_base.remove(not_base.indexOf(minimo));
		not_base.add(saida);
		Collections.sort(not_base);
	}

	private void custoMinimo() {
		minimo = not_base.get(0);
		int pos = 0, pos_min = 0;
		for (Integer i : not_base) {
			if (custo_rel[pos] < custo_rel[pos_min]) {
				minimo = i;
				pos_min = pos;
			}
			pos++;
		}
	}

	private boolean otimalidade() {
		custosRelativos();
		custoMinimo();
		for (double i : custo_rel) {
			if (i < 0)
				return false;
		}
		return true;
	}

	// private void swapCol(int a, int b) {
	// for (int i = 0; i < arq.getRestr(); i++) {
	// double tmp = arq.getSujeitoA()[i][a];
	// arq.getSujeitoA()[i][a] = arq.getSujeitoA()[i][b];
	// arq.getSujeitoA()[i][b] = tmp;
	// }
	// }
	//
	// private void swapLinha(int a, int b) {
	// for (int i = 0; i < arq.getVars(); i++) {
	// double tmp = arq.getSujeitoA()[a][i];
	// arq.getSujeitoA()[a][i] = arq.getSujeitoA()[b][i];
	// arq.getSujeitoA()[b][i] = tmp;
	// }
	// }

}
