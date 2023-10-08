/* Questão 03
* IFCE - Instituto Federal do Ceará - Campus Tianguá-CE
* Nome: Artur de Alevir; Francisco Alan Rodrigues Mesquita; Francisco Jonathan Rodrigues Fernandes;
*  Pedro Henrique Silveira Gomes Sabi; Murilo Rodrigues de Brito ;Yuri Melo Aquino de Sousa.
* Disciplina: Tópicos Especiais em Programação
* 4º Semestre (Bacharelado em Ciência da Computação) - 2023.2
*/

/*
 * #3. Elabore um algoritmo que implemente as seguintes funções: 
 * a) totalDePares: a função recebe como parâmetro um array de inteiros e 
 * retorna um  número inteiro indicando o total de números pares existentes no array. 
 *  b) maiorValorLido: a função recebe como parâmetro um array de inteiros e retorna o  
 *  maior número existente no array.  
 *  c) totalNumerosIguais: a função recebe como parâmetro dois arrays de inteiros e 
 *  retorna o  total de números iguais existentes em ambos os arrays.  
 * Obs1.: Usar laço repetição for(..; ...; .....)
 */


package main;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			//testar funções
			int[] v1 = {1, 2, 3, 10, 50, 20, 23, 100, 534, 213, 2}, v2 = {1, 5, 3, 2, 10, 2, 55, 1000, 5000};
			
			JOptionPane.showMessageDialog(null, "Total de Pares v1: " + totalDePares(v1), "TOTAL PARES V1", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Total de Pares v2: " + totalDePares(v2), "TOTAL PARES V2", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Maior valor v1: " + maiorValorLido(v1) , "MAIOR VALOR V1", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Maior valor v2: " + maiorValorLido(v2) , "MAIOR VALOR V2", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Valores iguais entre v1 e v2: " + totalNumerosIguais(v1, v2) , "VALORES IGUAIS", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static int totalDePares(int[] v) {
		int contarPares = 0;
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] % 2 == 0)
				contarPares++;
		}
		
		return contarPares;
	}

	public static int maiorValorLido(int[] v) {
		int maior = 0;
		
		for(int i = 0; i < v.length; i++) {
			if(i == 0)
				maior = v[i];
			if(v[i] > maior)
				maior = v[i];
		}
			
		return maior;
	}

	public static int totalNumerosIguais(int[] v1, int[] v2) {
		int[] naoRepetir = new int[v1.length + v2.length]; //só pra ter certeza!
		int contAux = 0;
		
		for(int i = 0; i < v1.length; i++) 
			for(int j = 0; j < v2.length; j++) {
				if(v1[i] == v2[j]) {
					naoRepetir[contAux] = v1[i];
					contAux++;
				}	
			}
		
		Set<Integer> aux = new HashSet<>(); //HashSet não permite números repetidos
		for(int a : naoRepetir) 
			aux.add(a);
		
		return aux.size();
	}
}