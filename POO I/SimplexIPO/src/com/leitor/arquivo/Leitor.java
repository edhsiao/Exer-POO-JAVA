package com.leitor.arquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {

	public static Arquivo leitor(String arquivo) {
		System.out.println("Iniciando Leitura de Arquivo");
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
			String line;
			String linha = bufferedReader.readLine();
			String colunas =  bufferedReader.readLine();
			//FO
			String funcao =  bufferedReader.readLine();
			String[] fo = funcao.split(",");
			//verifica se eh funcao de maximazacao ou minimizacao
			Boolean min;
			if (fo[0].equals("MIN")) {
				min = Boolean.TRUE;
			} else {
				min = Boolean.FALSE;
			}
			double[] funcaoObjetivo = new double[Integer.parseInt(colunas)];
			for (int i=1;i<=fo.length-1;i++) {
				funcaoObjetivo[i-1] = Double.parseDouble(fo[i]);
			}
			//SA
			double[][] matriz = new double[Integer.parseInt(linha)][Integer.parseInt(colunas)];
			int c = 0;
			double[] b = new double[Integer.parseInt(linha)];
			while ((line = bufferedReader.readLine()) != null) {
				String[] values = line.split(",");
				for (int i = 0; i <= values.length-1; i++) {
					if (i ==values.length-1) {
						b[c] =  Double.valueOf(values[i]);
					} else {
						matriz[c][i] = Double.valueOf(values[i]);						
					}
				}
				c++;					
			}
			System.out.println("Leitura de Arquivo Finalizada");
			
			Arquivo retorno = new Arquivo();
			retorno.setVars(Integer.parseInt(colunas));
			retorno.setRestr(Integer.parseInt(linha));
			retorno.setB(b);
			retorno.setMin(min);
			retorno.setfObjetivo(funcaoObjetivo);
			retorno.setSujeitoA(matriz);
			bufferedReader.close();
			return retorno;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
