package br.com.voeairlines.treinamentopoo;

public class Algoritmo16 {

	public String nome(String n) {
		return n;
	}

	public String primeiraLetra(String str) {
		String letra = str.substring(0, 1);
		return letra;
	}

	public String primeiroTerceiro(String str) {
		String letra = str.substring(0, 3);
		return letra;
	}

	public String menosPrimeira(String str) {
		String letra = str.substring(1);
		return letra;
	}

	public String ultimaLetra(String str) {
		int n = str.length();
		String ultimaLetra = str.substring(n - 1);
		return ultimaLetra;
	}

	public String quartaLetra(String str) {
		String letra = str.substring(3, 4);
		return letra;
	}
	
	public String doisUltimos(String str) {
		int n = str.length();
		String letra = str.substring(n-2, n);
		return letra;
	}

}
