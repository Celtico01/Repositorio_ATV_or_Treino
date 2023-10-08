/* Questão 01
* IFCE - Instituto Federal do Ceará - Campus Tianguá-CE
* Nome: Artur de Alevir; Francisco Alan Rodrigues Mesquita; Francisco Jonathan Rodrigues Fernandes;
*  Pedro Henrique Silveira Gomes Sabi; Murilo Rodrigues de Brito ;Yuri Melo Aquino de Sousa.
* Disciplina: Tópicos Especiais em Programação
* 4º Semestre (Bacharelado em Ciência da Computação) - 2023.2
*/

/*
 * #1. Elabore um algoritmo que possua dois vetores (vet1 e vet2 com 10 posições), 
nde o primeiro deles irá  receber valores inteiros informados pelo usuário via teclado e o 
segundo vetor conterá o fatorial de cada número que foi informado baseado em cada índice. 
Obs1.: Não existe fatorial de número negativo. Obs2.: Usar o laço de repetição do{...}while(...);
*

 */

package main;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		try {
			int[] vet1 = new int[10], vet2 = new int[10];
			
			for(int i = 0; i < vet1.length; i++) {
				vet1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o " + (i + 1) + "° valor"));
				
				if(vet1[i] < 0)
					throw new Exception("Número Negativo");
				
				vet2[i] = calcularFatorial(vet1[i]);
			}
			String exibirVetor = "****************\n";
			
			for(int i = 0; i < vet2.length; i++) {
				exibirVetor += "Fatorial de " + vet1[i] + " = " + vet2[i] + "\n";
			}
			
			exibirVetor += "****************";
			
			JOptionPane.showMessageDialog(null, exibirVetor, "Fatorial", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);;
		}
	}

	public static int calcularFatorial(int num) {
		int fat = 1;
	    int cont = 1;
	    if(num == 0)
	    	return 0;
	
	    do{
	        for(int i = 1; i <= num; i++){
	            fat = fat * i;
	        }
	       
	        cont++;
	        
	    }while(cont < 2);
	    
	    return fat;
		}
}
