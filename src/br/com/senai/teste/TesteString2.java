package br.com.senai.teste;

public class TesteString2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Strin: métodos úteis
		 */

		String disciplina = "Sistemas Orientados a Objetos I";
		System.out.println("disciplina: " + disciplina);

		// Isolando um caractere:

		System.out.print("primeiro caractere: ");
		System.out.println(disciplina.charAt(0));
		System.out.print("segundo caractere: ");
		System.out.println(disciplina.charAt(1));

		// O primeiro caractere de uma String tem o
		// índice 0, o segundo o índice 1 e assim por diante
		// letra = 's';

		char letra = disciplina.charAt(2);

		// substrings:

		System.out.print("primeiras cinco letras: ");
		System.out.println(disciplina.substring(0, 5));
		System.out.print("letras a partir da quarta: ");
		System.out.println(disciplina.substring(4));
	}

}
