/* Questão 02
* IFCE - Instituto Federal do Ceará - Campus Tianguá-CE
* Nome: Artur de Alevir; Francisco Alan Rodrigues Mesquita; Francisco Jonathan Rodrigues Fernandes;
*  Pedro Henrique Silveira Gomes Sabi; Murilo Rodrigues de Brito ;Yuri Melo Aquino de Sousa.
* Disciplina: Tópicos Especiais em Programação
* 4º Semestre (Bacharelado em Ciência da Computação) - 2023.2
*/

/*
 * #2.   Crie uma função que receba um vetor de 20 posições 
 * com números inteiros e coloque eles em ordem crescente. 
 * Crie sua própria função para isso. Usar laço de repetição while(...){...}
 */

package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			int[] vetorDesorganizado = new int[20];
			for(int i = 0; i < vetorDesorganizado.length; i++) {
				vetorDesorganizado[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número: "));
			}
			
			int[] vetorOrganizado = organizarVetor(vetorDesorganizado);
			String exibirVetor = "********************************\n";
			
			for(int i = 0; i < vetorOrganizado.length; i++) {
				exibirVetor += "Posição " + (i + 1) + ": " + vetorOrganizado[i] + "\n";
			}
			exibirVetor += "********************************";
			
			JOptionPane.showMessageDialog(null, exibirVetor, "Vetor Organizado", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
		}

	}
	
	public static int[] organizarVetor(int[] vetorDesorganizado) {
		int i, j, aux;
		int[] v = vetorDesorganizado;
		
		for(i = 1; i < v.length; i++) {
			j = i;
			while((j != 0) && (v[j] < v[j - 1])) {
				aux = v[j];
				v[j] = v[j - 1];
				v[j - 1] = aux;
				j--;
			}
		}
		return v;
	}
}
