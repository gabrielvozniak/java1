package br.com.senai.teste;

public class TesteOuE {
	public static void main(String[] args) {
		/*
		* Comandos de decis�o utilizando express�es booleanas
		*/
		
		int mes = 2;
		if((mes == 12) || (mes == 1))
		{
		System.out.println("F�rias :)" );
		}
		if((mes > 1) && (mes < 12))
		{
		System.out.println("Semestre Em Andamento");
		}
		if((mes != 2))
		{
		System.out.println("N�o Tem Carnaval ");
		}
	}

}
