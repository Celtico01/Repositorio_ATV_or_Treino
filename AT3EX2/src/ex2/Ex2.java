package ex2;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		/*#2.  Faça um algoritmo que leia os valores A, B, C e 
		  diga se a média dos números é maior ou igual que um deles.*/
		
		
		try {
			double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de A:"));
			double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de B:"));
			double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de C:"));
			
			double media = (a + b + c) / 3;
			
			if(media >= a || media > b || media > c) {
				JOptionPane.showMessageDialog(null, "Média é maior ou igual");
				return;
			}
			JOptionPane.showMessageDialog(null, "Média é menor");
				
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}

	}

}
