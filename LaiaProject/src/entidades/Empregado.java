package entidades;

public abstract class Empregado {
    private String nome;
	private int horasTrabalhadas;
    private double valorPorHora;

    public Empregado(String nome, int horasTrabalhadas, double valorPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
    
    public String getNome() {
		return nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}
	
	public abstract double calcularPagamento();
}
