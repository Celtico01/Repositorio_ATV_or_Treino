package ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * #4. Construa um algoritmo que receba três notas
		 * e calcule a média ponderada das notas. 
		 * Obs.: As notas devem ser insiradas via teclado e 
		 * logo após os pesos de cada nota também devem ser informados pelo usuário. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, p1, p2, p3, mediapond;
		
		System.out.print("Insira a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("Insira a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.print("Insira a terceira nota: ");
		n3 = sc.nextDouble();
		
		System.out.print("Insira o primeiro peso: ");
		p1 = sc.nextDouble();
		System.out.print("Insira o segundo peso: ");
		p2 = sc.nextDouble();
		System.out.print("Insira o terceiro peso: ");
		p3 = sc.nextDouble();
		
		mediapond = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
		
		System.out.printf("Média: %.2f", mediapond);
		
		sc.close();
	}

}
