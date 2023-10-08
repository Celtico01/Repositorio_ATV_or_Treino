package ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		#1. Construa um algoritmo que receba
//		o nome e a idade de uma pessoa em anos e 
//		retorne como saída a idade em dias, horas, minutos e segundos.
//		Obs.: Considerar para 1 ano = 365 dias.
		
		Scanner sc = new Scanner(System.in);		
		
		String nome = null;
		int dias, horas, idade;
		long segundos, minutos;
		
		System.out.print("Insira o nome: ");
		nome = sc.nextLine();
		System.out.print("Insira a idade: ");
		idade = sc.nextInt();
		
		dias = idade * 365;
		horas = dias * 24;
		minutos = horas * 60;
		segundos = minutos * 60;
		
		System.out.println("----------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("QTDE dias: " + dias);
		System.out.println("QTDE horas: " + horas);
		System.out.println("QTDE minutos: " + minutos);
		System.out.println("QTDE segundos: " + segundos);
		if(idade >= 100)
			System.out.println("Ta velhin em!");
		System.out.println("----------------------------------");
		
		sc.close();
	}

}
