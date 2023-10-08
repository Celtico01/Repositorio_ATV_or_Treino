package ex6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que receba o nome de um produto
		 *  e devolva o valor de venda acrescido de 15%, 
		 * tomando como base o valor de compra de um produto.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String nomeProd;
		double valorVenda;
		
		System.out.print("Nome do produto: ");
		nomeProd = sc.nextLine();
		System.out.print("Valor de venda: ");
		valorVenda = sc.nextDouble();
		
		valorVenda += valorVenda * 15/100;
		
		System.out.println("O produto " + nomeProd + " foi vendido por: " + valorVenda);
		
		sc.close();
	}

}
