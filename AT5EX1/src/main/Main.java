package main;

import javax.swing.JOptionPane;

/*#1. Construa um vetor de 10 posições preencha-os com nomes de pessoas
 *  com a entrada de dados via caixa de diálogos e exibí-los. 
 *  Obs1.: Utilizar o laço de repetição for (inicializador; condicao; incremento) {...}; 
 */


public class Main {

	public static void main(String[] args) {
		try {
			String[] nome = new String[10];
			
			for(int i = 0; i < nome.length; i++) {
				nome[i] = JOptionPane.showInputDialog(null, "Insira o " + (i + 1) + "º nome:", "Input", JOptionPane.QUESTION_MESSAGE);
			}
			
			String exibirString = "**********************************\n";
			
			for(int i = 0; i < nome.length; i++) {
				exibirString += "Nome da " + (i + 1) + "º pessoa: " + nome[i] + "\n";
			}
			exibirString += "**********************************";
			
			JOptionPane.showMessageDialog(null, exibirString, "Output", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}

}
