package ex1;

public class CadastroFuncionario {
	private String nome;
	private int idade;
	private double salario;
	private String funcao;
	private String endereco;
	private int numDep;
	
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumDep() {
		return numDep;
	}
	public void setNumDep(int numDep) {
		this.numDep = numDep;
	}
	
	public void exibirDados() {
		javax.swing.JOptionPane.showMessageDialog(null, "CadastroFuncionario [nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", funcao=" + funcao
				+ ", endereco=" + endereco + ", numDep=" + numDep + "]", "Dados", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}
}
