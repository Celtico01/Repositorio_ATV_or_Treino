package main;

import javax.swing.JOptionPane;

import constantes.*;

/*
#2. Questão: Elabore um enunciado de um problema relacionado a matrizes cuja temática esteja ligada ao cubo mágico.
Obs1.: O problema deverá ser resolvido utilizando se possível: 
(i) Estrutura de seleção; 
(ii) Laço de repetição; 
(iii) Tratamento de exceções; 
(iv) Adotar um cubo mágico com 6 lados onde em cada lado tem-se apenas 9 posições. 
Obs2.: Anexar um arquivo zipado contendo um arquivo em .pdf com o enunciado do problema e o projeto. 
*/

/*Enunciado:
  Crie um cubo mágico e verifique se ele está resolvido.
 */

public class Main {

	public static void main(String[] args) {
		try {
			int[][][] cuboMagico = {
		            {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, // Lado 1
		            {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}}, // Lado 2
		            {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}}, // Lado 3
		            {{4, 4, 4}, {4, 4, 4}, {4, 4, 4}}, // Lado 4
		            {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}}, // Lado 5
		            {{6, 6, 6}, {6, 6, 6}, {6, 6, 6}}  // Lado 6
		        };
			
			if(cuboResolvido(cuboMagico)) {
				JOptionPane.showMessageDialog(null, "O cubo está resolvido!\n Cubo: \n" + exibirCubo(cuboMagico), "Resolvido!", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "O cubo não está resolvido!\n Cubo: \n" + exibirCubo(cuboMagico), "Não Resolvido!", JOptionPane.INFORMATION_MESSAGE);

			}
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
		}

	}
	
	public static boolean ladoResolvido(int[][] lado) {
        int primeiraCor = lado[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (lado[i][j] != primeiraCor) {
                    return false;
                }
            }
        }
        return true;
    }
	
	public static boolean cuboResolvido(int[][][] cubo) {
        for (int i = 0; i < 6; i++) {
            if (!ladoResolvido(cubo[i])) {
                return false;
            }
        }
        return true;
    }
	
	public static String exibirCubo(int[][][] cubo) {
		String aux = "";
		int auxNum;
		
		for(int i = 0; i < 6; i++) {
			aux += "Lado " + (i + 1) + ":\n";
			for(int j = 0; j < 3; j++) {
				aux += "Linha " + (j + 1) + ":";
				for(int h = 0; h < 3; h++) {
					auxNum = cubo[i][j][h];
					switch(auxNum) {
						case Consts.AZUL:
							if(h == 0)
								aux += "{Azul, ";
							if(h == 1)
								aux += "Azul, ";
							if(h == 2) 
								aux += "Azul}\n";
						break;
						case Consts.AMARELO:
							if(h == 0)
								aux += "{Amarelo, ";
							if(h == 1)
								aux += "Amarelo, ";
							if(h == 2) 
								aux += "Amarelo}\n";
						break;
						case Consts.BRANCO:
							if(h == 0)
								aux += "{Branco, ";
							if(h == 1)
								aux += "Branco, ";
							if(h == 2)
								aux += "Branco}\n";
							
						break;
						case Consts.LARANJA:
							if(h == 0) 
								aux += "{Laranja, ";
							if(h == 1)
								aux += "Laranja, ";
							if(h == 2)
								aux += "Laranja}\n";
						break;
						case Consts.VERDE:
							if(h == 0)
								aux += "{Verde, ";
							if(h == 1)
								aux += "Verde, ";
							if(h == 2)
								aux += "Verde}\n";
						break;
						case Consts.VERMELHO:
							if(h == 0) 
								aux += "{Vermelho, ";
							if(h == 1)
								aux += "Vermelho, ";
							if(h == 2)
								aux += "Vermelho}\n";
						break;
					
					}
				}
			}
		}
		return aux;
	}

}