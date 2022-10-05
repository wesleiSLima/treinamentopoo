package br.com.voeairlines.treinamentopoo;

public class Algoritmo15 {
	
	public double valorAPagar(double salario, double kw) {
		double csalario = salario/7;
		double vkw = csalario/100;
		double result = kw*vkw;
		
		return result;
	}
	
	public double calculaKw(double salario, double kw) {
		double csalario = salario/7;
		double vkw = csalario/100;
		return vkw;
	}

}
