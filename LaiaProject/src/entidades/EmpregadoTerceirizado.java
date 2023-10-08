package entidades;

public class EmpregadoTerceirizado extends Empregado {
    private double despesaAdicional;

    public EmpregadoTerceirizado(String nome, int horasTrabalhadas, double valorPorHora, double despesaAdicional) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public double calcularPagamento() {
        double pagamentoBase = getValorPorHora() * getHorasTrabalhadas();
        double bonus = despesaAdicional * 1.1;
        return pagamentoBase + bonus;
    }
}
