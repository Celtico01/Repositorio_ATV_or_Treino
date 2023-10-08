package ex3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Construa um algoritmo que calcule o preço de venda de um produto, 
		 * sabendo que o lucro dever ser de 27,50% em relação ao preço de venda.
		 */
		Scanner sc = new Scanner(System.in);
		
		double lucro, precoVenda;
		
		System.out.print("Insira o preço de venda: ");
		precoVenda = sc.nextDouble();
		
		lucro = precoVenda * 27.50 / 100;
		
		precoVenda += lucro;
		
		System.out.println("Preço de venda + Lucro = " + precoVenda);
		
		sc.close();
	}
}
