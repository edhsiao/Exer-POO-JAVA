package com.leitor.arquivo;

public class Arquivo {
	double[][] sujeitoA;
	double[] fObjetivo;
	double[] b;
	int restr;
	int vars;
	public double[] getB() {
		return b;
	}
	public void setB(double[] b) {
		this.b = b;
	}
	Boolean min;
	public double[][] getSujeitoA() {
		return sujeitoA;
	}
	public void setSujeitoA(double[][] sujeitoA) {
		this.sujeitoA = sujeitoA;
	}
	public double[] getfObjetivo() {
		return fObjetivo;
	}
	public void setfObjetivo(double[] fObjetivo) {
		this.fObjetivo = fObjetivo;
	}
	public Boolean getMin() {
		return min;
	}
	public void setMin(Boolean min) {
		this.min = min;
	}
	public int getRestr() {
		return restr;
	}
	public void setRestr(int restr) {
		this.restr = restr;
	}
	public int getVars() {
		return vars;
	}
	public void setVars(int vars) {
		this.vars = vars;
	}
}
