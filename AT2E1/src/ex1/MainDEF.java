package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDEF{
	
	public static void verificarNumero(int idade) {
		if(idade < 0) {
			throw new NegativeNumberException();
		}
		if(idade == 0) {
			throw new ZeroNumberException();
		}
	}

	public static void main(String[] args) {
//		#1. Construa um algoritmo que receba
//		o nome e a idade de uma pessoa em anos e 
//		retorne como saída a idade em dias, horas, minutos e segundos.
//		Obs.: Considerar para 1 ano = 365 dias.
		
		Scanner sc = new Scanner(System.in);		
		
		String nome = null;
		int idade = -1000000000;
		int dias, horas;
		long segundos, minutos;
		
		do {
			try {
				System.out.print("Insira o nome: ");
				nome = sc.nextLine();
				System.out.print("Insira a idade: ");
				idade = sc.nextInt();
				verificarNumero(idade);
			}
			catch(InputMismatchException e) {
				System.out.println("Você digitou a idade errado, insira apenas números inteiros!");
				flush(sc);
			}
			catch(NegativeNumberException e) {
				System.out.println("Erro: " + e.getMessage());
				System.out.println("A idade não pode ser negativa, tente novamente!");
				flush(sc);
			}
			catch(ZeroNumberException e) {
				System.out.println("Erro: " + e.getMessage());
				System.out.println("A idade não pode ser 0, tente novamente!");
				flush(sc);
			}
		}while(idade < 1);
		
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
	
	public static void flush(Scanner scanner) {
	    if (scanner.hasNextLine()) 
	        scanner.nextLine();
	}
	
}




