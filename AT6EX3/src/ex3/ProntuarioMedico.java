package ex3;

public class ProntuarioMedico {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private char sexo;
	private String fatorRH;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getFatorRH() {
		return fatorRH;
	}
	public void setFatorRH(String fatorRH) {
		this.fatorRH = fatorRH;
	}
	
	public void exibirDados() {
		javax.swing.JOptionPane.showMessageDialog(null, "ProntuarioMedico [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura
				+ ", sexo=" + sexo + ", fatorRH=" + fatorRH + "]", "Dados!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}
}
