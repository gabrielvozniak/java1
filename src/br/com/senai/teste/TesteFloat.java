package br.com.senai.teste;

public class TesteFloat {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//
		// Promoção entre valores de tipos de dados distintos
		// Apesar 6 ser um inteiro, o valor da variável grande
		// continua sendo do tipo long
		
		long grande = 6;
		
		// Uma variável do tipo inteiro não possui
		// espaço para armazenar um valor longo.
		// A instrução abaixo é ilegal, e causará um erro de compilação.
		
		long pequeno = 99L;
		float a = 12.121F; // correto
		double b = 12.121; // 12.121 é um double - incorreto
	}

}
