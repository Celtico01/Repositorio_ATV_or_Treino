package ex2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Construa um algoritmo que receba dois valores como entrada e troque-os de posição, 
		 * por fim informe o antes e o depois da troca.
		 */
		Scanner sc = new Scanner(System.in);
		int n1, n2, aux;
		
		System.out.print("Insira o primeiro número: ");
		n1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.println("Antes da troca");
		System.out.println("Primeiro: " + n1);
		System.out.println("Segundo: " + n2);
		
		aux = n2;
		n2 = n1;
		n1 = aux;
		
		System.out.println("Depois da troca");
		System.out.println("Primeiro: " + n1);
		System.out.println("Segundo: " + n2);
		
		sc.close();
	}
}
