package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * #2. Faça uma algoritmo que calcule a média ponderada entre dois valores, 
		 * de forma que seja indicado os valores e os pesos pelo usuário do sistema, 
		 * ao final imprima o resultado na tela.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double v1, v2, mediapond;
		int p1, p2;
		
		System.out.print("Informe o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.print("Informe o segundo valor: ");
		v2 = sc.nextDouble();
		
		System.out.print("Informe o primeiro peso: ");
		p1 = sc.nextInt();
		System.out.print("Informe o segundo peso: ");
		p2 = sc.nextInt();
		
		mediapond = ((v1 * p1) + (v2 * p2)) / (p1 + p2);
		
		System.out.printf("Média: %.2f", mediapond);
		
		sc.close();
	}

}
