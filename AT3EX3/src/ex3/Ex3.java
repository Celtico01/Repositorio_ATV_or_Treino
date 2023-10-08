package ex3;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		/*#3. Faça um algoritmo para verificar se o ano lido é bissexto. 
		 Obs.: O ano bissexto é divisível por 4.;  
		 Ano bissexto não pode ser divisível por 100; 
		 O Ano bissexto pode ser divisível por 400.*/
		 
		try {
			int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano:"));
			
			if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
				JOptionPane.showMessageDialog(null, "Ano bissexto!");
				return;
			}
			JOptionPane.showMessageDialog(null, "Ano não é bissexto!");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}

	}

}
