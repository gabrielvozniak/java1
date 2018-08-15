package br.com.senai.teste;

public class TesteString {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Concatenação de Strings
		 */

		String sigla = "SOO-I";
		String nome = "Sistemas Orientados a Objetos I";
		String titulo = sigla + " - " + nome;

		// Esse comando imprimirá na tela a frase:
		// SOO-I – Sistemas Orientados a Objetos I

		System.out.println(titulo);
		int i = 10;
		String legenda = "valor = ";

		// campo é uma variável do tipo String

		String campo = legenda + i;
	}
}
