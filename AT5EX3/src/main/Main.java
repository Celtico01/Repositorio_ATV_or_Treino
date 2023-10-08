package main;

import javax.swing.JOptionPane;
import java.util.Random;

/*
 * #3. Desenvolva um algoritmo que gere aleatoriamente valores para uma matriz LxC e 
 * escreva as coordenadas (linha x coluna) do maior e do menor elemento. 
 * Os valores aleatórios devem ser do tipo ponto flutuante duplo e gerados no intervalo [0,1]. 
 * Obs1.: Para gerar os valores aleatórios pesquisar alguma função. 
 * Obs2.: Usar o laço de repetição for. 
 * Obs3.: O usuário deve informar a quantidade de linhas e colunas.
 */

public class Main {

	public static void main(String[] args) {
		try {
			Random rand = new Random();
			int LINHA, COLUNA;
			LINHA = Integer.parseInt(JOptionPane.showInputDialog(null, "Qtde de Linhas:", "Input", JOptionPane.QUESTION_MESSAGE));
			if(LINHA <= 0)
				throw new NumberFormatException("Qtde de linhas inválida!");
			COLUNA = Integer.parseInt(JOptionPane.showInputDialog(null, "Qtde de Colunas:", "Input", JOptionPane.QUESTION_MESSAGE));
			if(COLUNA <= 0)
				throw new NumberFormatException("Qtde de colunas inválida!");
			
			double[][] matriz = new double[LINHA][COLUNA];
			
			double maior = 0, menor = 0;
			
			for(int i = 0; i < LINHA; i++) {
				for(int j = 0; j < COLUNA; j++) {
					matriz[i][j] = rand.nextDouble(0, 1);
					if((i + j) == 0) {
						maior = matriz[i][j];
						menor = matriz[i][j];
					}
					if(matriz[i][j] > maior)
						maior = matriz[i][j];
					if(matriz[i][j] < menor)
						menor = matriz[i][j];
				}
			}
			
			String exibirString = "*****************************************\n";
			
			for(int i = 0; i < LINHA; i++) {
				for(int j = 0; j < COLUNA; j++) {
					if(maior == matriz[i][j])
						exibirString += "Maior está nas coordenadas: { Linha: " + (i + 1) + ", Coluna: " + (j + 1) + " }\n";
					if(menor == matriz[i][j])
						exibirString += "Menor está nas coordenadas: { Linha: " + (i + 1) + ", Coluna: " + (j + 1) + " }\n";
				}
			}
			exibirString += "*****************************************";
			
			JOptionPane.showMessageDialog(null, exibirString, "Output", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
}
