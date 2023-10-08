package ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		  #1. Escreva um algoritmo para criar um programa de ajuda para vendedores.  
		  A partir de um valor total recebido do teclado, mostrar:
-         O total a pagar com desconto de 10%;

-         O valor de cada parcela, no parcelamento de 3 x  sem juros;

-         A comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)

-         A comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double valorTotal, valorDesconto, parcelas[] = new double[3], comissaoVendVista, comissaoVendParc;
		
		System.out.print("Valor total: ");
		valorTotal = sc.nextDouble();
		
		valorDesconto = valorTotal - valorTotal * 0.1;
		
		double aux = valorTotal / 3;
		
		for(int i = 0; i < parcelas.length; i++) 
			parcelas[i] = aux;
		
		comissaoVendVista = 0.05 * valorDesconto;
		
		comissaoVendParc = 0.05 * valorTotal;
		
		System.out.println("------------------------------------------------------------------");
		System.out.printf("Valor total: %.2f\n", valorTotal);
		System.out.printf("Valor desconto: %.2f\n", valorDesconto);
		System.out.printf("Parcela 1: %.2f, Parcela 2: %.2f, Parcela 3: %.2f\n", parcelas[0], parcelas[1], parcelas[2]);
		System.out.printf("Comissão do vendedor a vista: %.2f\n", comissaoVendVista);
		System.out.printf("Comissão do vendedor a prazo: %.2f\n", comissaoVendParc);
		System.out.println("------------------------------------------------------------------");
		
		sc.close();
	}

}
