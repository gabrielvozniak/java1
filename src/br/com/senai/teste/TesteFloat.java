package br.com.senai.teste;

public class TesteFloat {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//
		// Promo��o entre valores de tipos de dados distintos
		// Apesar 6 ser um inteiro, o valor da vari�vel grande
		// continua sendo do tipo long
		
		long grande = 6;
		
		// Uma vari�vel do tipo inteiro n�o possui
		// espa�o para armazenar um valor longo.
		// A instru��o abaixo � ilegal, e causar� um erro de compila��o.
		
		long pequeno = 99L;
		float a = 12.121F; // correto
		double b = 12.121; // 12.121 � um double - incorreto
	}

}
