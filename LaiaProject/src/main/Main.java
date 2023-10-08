package main;

import entidades.*;

public class Main {

	public static void main(String[] args) {
		EmpregadoProprio empregadoProp1 = new EmpregadoProprio("Pedro", 120, 5);
		
		EmpregadoTerceirizado empregadoTerce1 = new EmpregadoTerceirizado("Lucas", 360, 6, 400);
		
		System.out.println("Dados do empregado próprio:");
        System.out.println("Nome: " + empregadoProp1.getNome());
        System.out.println("Horas Trabalhadas: " + empregadoProp1.getHorasTrabalhadas());
        System.out.println("Valor por Hora: " + empregadoProp1.getValorPorHora());
        System.out.println("Pagamento: " + empregadoProp1.calcularPagamento());

        System.out.println("\nDados do empregado terceirizado:");
        System.out.println("Nome: " + empregadoTerce1.getNome());
        System.out.println("Horas Trabalhadas: " + empregadoTerce1.getHorasTrabalhadas());
        System.out.println("Valor por Hora: " + empregadoTerce1.getValorPorHora());
        System.out.println("Despesa Adicional: " + empregadoTerce1.getDespesaAdicional());
        System.out.println("Pagamento: " + empregadoTerce1.calcularPagamento());
	}

}
