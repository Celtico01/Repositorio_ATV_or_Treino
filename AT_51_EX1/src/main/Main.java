package main;

import javax.swing.JOptionPane;

/*#1. Questão: Elabore um enunciado de um problema relacionado a vetores cuja temática esteja ligada ao setor comercial.
Obs1.: O problema deverá ser resolvido utilizando: 
(i) Estrutura de seleção; 
(ii) Laço de repetição; 
(iii) Tratamento de exceções; 
(iv) Não ter menos de 10 posições nem mais de 20 posições. 
Obs2.: Anexar um arquivo zipado contendo um arquivo em .pdf com o enunciado do problema e o projeto. 
*/

/*Enunciado: 
 * Preencha um vetor de 10 a 20 posições com vários valores e verifique e exiba qual é o maior! 
 */
public class Main {

	public static void main(String[] args) {
		try {
			int tamVetor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de valores:", "Input", JOptionPane.QUESTION_MESSAGE));
			
			if(tamVetor > 20 || tamVetor < 10)
				throw new Exception("Tamanho do vetor inválido!");
			
			double[] valores = new double[tamVetor];
			
			double maior = 0;
			
			for(int i = 0; i < valores.length; i++) {
				valores[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o " + (i + 1) + "º valor:", "Input", JOptionPane.INFORMATION_MESSAGE));
				
				if(i == 0) 
					maior = valores[i];
				if(valores[i] > maior)
					maior = valores[i];
			}
			
			JOptionPane.showMessageDialog(null, String.format("O maior valor é: %.2f", maior), "Maior Valor", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
		}

	}

}
