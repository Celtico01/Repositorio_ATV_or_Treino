package entidades;

public class EmpregadoProprio extends Empregado {
    public EmpregadoProprio(String nome, int horasTrabalhadas, double valorPorHora) {
        super(nome, horasTrabalhadas, valorPorHora);
    }

	public double calcularPagamento() {
		return getHorasTrabalhadas() * getValorPorHora();
	}
}
