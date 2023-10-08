package ex4;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
//		#4. Elabore um algoritmo que verifique se um número é par ou ímpar. 
//		Obs.: Utilizar operador ternário.
		
		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número:"));
			
			if(num % 2 == 0 ? true : false) {
				JOptionPane.showMessageDialog(null, "Número é par!");
				return;
			}
			JOptionPane.showMessageDialog(null, "Número é impar!");
			
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}
	}

}
