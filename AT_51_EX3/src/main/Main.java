package main;

import javax.swing.JOptionPane;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/*O programa deve ser capaz de calcular a média das notas de três disciplinas diferentes
 *  para cada aluno e fornecer informações úteis para a escola. 
 */

public class Main {

    public static void main(String[] args) {
        try {
            String[][] boletim = new String[5][6];

            // Defina o Locale para usar o ponto como separador decimal
            Locale.setDefault(Locale.US);

            // Inserção do cabeçalho
            boletim[0][0] = "Nome do Aluno";
            boletim[0][1] = "Disciplina";
            boletim[0][2] = "Nota 01";
            boletim[0][3] = "Nota 02";
            boletim[0][4] = "Nota 03";
            boletim[0][5] = "Média";

            int linhaAtual = 1;

            while (true) {
                String nome = JOptionPane.showInputDialog(null, "Insira o Nome:", "Input", JOptionPane.QUESTION_MESSAGE);

                String disciplina = JOptionPane.showInputDialog(null, "Insira a disciplina:", "Input",
                        JOptionPane.QUESTION_MESSAGE);

                // Inserção do nome e disciplina na matriz
                boletim[linhaAtual][0] = nome;
                boletim[linhaAtual][1] = disciplina;

                // Loop para inserção das notas com tratamento de exceções
                for (int i = 0; i < 3; i++) {
                    boolean notaValida = false;
                    double nota = 0.0;
                    while (!notaValida) {
                        String inputNota = JOptionPane.showInputDialog(null, "Insira a nota " + (i + 1) + "º nota:");
                        inputNota = inputNota.replace(",", "."); // Substitui vírgula por ponto
                        try {
                            nota = Double.parseDouble(inputNota);
                            if (nota < 0 || nota > 10) {
                                throw new NumberFormatException("Nota Invalida!");
                            }
                            notaValida = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Nota inválida. Insira um valor entre 0 e 10.",
                                    "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    boletim[linhaAtual][i + 2] = String.format("%.2f", nota);
                }

                // Cálculo da média e inserção na matriz
                double nota01 = Double.parseDouble(boletim[linhaAtual][2]);
                double nota02 = Double.parseDouble(boletim[linhaAtual][3]);
                double nota03 = Double.parseDouble(boletim[linhaAtual][4]);
                double media = (nota01 + nota02 + nota03) / 3;
                boletim[linhaAtual][5] = String.format("%.4f", media);

                // Perguntar ao usuário se deseja inserir mais alunos
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja inserir mais alunos?", "Pergunta",
                        JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.NO_OPTION) {
                    break;
                } else {
                    // Incrementar o índice da linha
                    linhaAtual++;
                }
            }

            // Usar um StringBuilder para construir a string de exibição do boletim
            StringBuilder exibirBoletim = new StringBuilder("\nBoletim Completo:\n");
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                	if(boletim[i][j] != null)
                		exibirBoletim.append(boletim[0][j]).append(": \t");
                    	exibirBoletim.append(boletim[i][j]).append("\t\n");
                }
                exibirBoletim.append("\n");
            }

            // Exibir o boletim usando JOptionPane
            JOptionPane.showMessageDialog(null, exibirBoletim.toString(), "Boletim", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}


