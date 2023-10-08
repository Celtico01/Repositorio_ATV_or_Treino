package main;

import javax.swing.JOptionPane;

/*
 * #4. Construa um algoritmo que implemente um vetor de 15 posições de inteiros.
 * A seguir construa outro vetor de 5 posições onde em cada posição será armazenado 
 * o MMC (Mínimo Múltiplo Comum) de cada 3 valores armazenados, partindo do índice 0 até o indice 14. 
 * Obs1.: Os valores informados devem estar dentro do intervalo de 1 a 20 somente.
 */

public class Main {

	public static void main(String[] args) {
		try {
			int[] vNum = new int[15];
			int[] mmcV = new int[5];
			
			for(int i = 0; i < vNum.length; i++) {
				vNum[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor(1 - 20):", "Input", JOptionPane.QUESTION_MESSAGE));
				if(vNum[i] > 20 || vNum[i] < 1)
					throw new NumberFormatException("Intervalo inválido, precisa ser entre 1 e 20! Número inserido: " + vNum[i]);
			}
			
			String exibirString = "***********************************\n";
			
			int countAux = 0;
			for(int i = 0; i < mmcV.length; i++) {
				mmcV[i] = calcularMMC(vNum[countAux], vNum[(countAux + 1)], vNum[(countAux + 2)]);
				exibirString += "O MMC de { " + vNum[countAux] + ", " + vNum[(countAux  +1)] + ", " + vNum[(countAux + 2)] + " } é : " + mmcV[i] + "\n";
				countAux += 3;
			}
			
			exibirString += "***********************************";
			
			JOptionPane.showMessageDialog(null, exibirString, "Output", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}
	
	// Função para calcular o MDC (Máximo Divisor Comum)
    public static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMDC(b, a % b);
    }
    
    // Função para calcular o MMC de dois números
    public static int calcularMMC(int a, int b) {
        return (a * b) / calcularMDC(a, b);
    }
    
    // Função para calcular o MMC de três números
    public static int calcularMMC(int a, int b, int c) {
        int mmcAB = calcularMMC(a, b);
        return calcularMMC(mmcAB, c);
    }

}
