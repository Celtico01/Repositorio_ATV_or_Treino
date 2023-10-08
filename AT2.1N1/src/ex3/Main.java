package ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * #3.  Faça um algoritmo que calcule o IMC- (Índice de massa corporal) de uma pessoa. 
		 * IMC: P/H2 . 
		 * Onde: P é o peso e H a altura.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double peso, altura;
		
		System.out.printf("Insira o peso: ");
		peso = sc.nextDouble();
		System.out.printf("Insira a altura(m): ");
		altura = sc.nextDouble();
		
		altura *= altura;
		
		System.out.println("IMC: " + (peso / altura));
		
		sc.close();
	}

}
