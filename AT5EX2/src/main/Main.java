package main;

import javax.swing.JOptionPane;

/*
 * #2. Construa uma matriz 2x2x2 e preencha com nomes de animais via teclado (JOptionPane) em seguida exiba-os. 
 * Obs1. Utilizar o laço de repetição While(condicao){...}; 
 */

public class Main {

	public static void main(String[] args) {
		try {
			String[][][] tabelasAnimais = new String[2][2][2];
			
			for(int i = 0; i < tabelasAnimais.length; i ++) {
				for(int j = 0; j < tabelasAnimais.length; j++) {
					for(int h = 0; h < tabelasAnimais.length; h++) {
						tabelasAnimais[i][j][h] = JOptionPane.showInputDialog(null, "Insira o nome do animal: ", "Input", JOptionPane.QUESTION_MESSAGE);
					}
				}
			}
			String exibirString = "**********************************\n";
			int cont = 0;
			
			for(int i = 0; i < tabelasAnimais.length; i ++) {
				for(int j = 0; j < tabelasAnimais.length; j++) {
					for(int h = 0; h < tabelasAnimais.length; h++) {
						exibirString += "Nome do " + (cont + 1) + "º animal: " + tabelasAnimais[i][j][h] + "\n";
						cont++;
					}
				}
			}
			
			exibirString += "**********************************";
			
			JOptionPane.showMessageDialog(null, exibirString, "Output", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}

}
