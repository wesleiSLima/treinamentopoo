package br.com.voeairlines.treinamentopoo;

public class Algoritmo17 {
	public double area(double base, double altura) {
		double result = base * altura;
		return result;
	}

	public double perimetro(double base, double altura) {
		double result = 2 * (base + altura);
		return result;
	}

	public double diagonal(double base, double altura) {
		double result = Math.sqrt((Math.pow(base, 2)) + Math.pow(altura, 2));
		return result;
	}

}
