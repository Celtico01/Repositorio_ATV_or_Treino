package ex5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Construa um programa que leia
		 *  a temperatura de um objeto em graus Celsius
		 * e converta em graus Fahrenheit e em seguida em Kelvin. 
		 * Obs.: Informar o nome do objeto e a temperatura. 
		 */
		Scanner sc = new Scanner(System.in);
		
		double cel, fah, kel;
		String nomeObj;
		
		System.out.print("Nome do objeto: ");
		nomeObj = sc.nextLine();
		System.out.print("Temperatura do " + nomeObj + " em graus celsius: ");
		cel = sc.nextDouble();
		
		fah = cel * 1.8 + 32;
		kel = cel + 273;
		
		System.out.println("Temperaturas do(a) " + nomeObj + ":");
		System.out.println("Fahrenheit: " + fah);
		System.out.println("Kelvin: " + kel);
		
		sc.close();
	}

}
