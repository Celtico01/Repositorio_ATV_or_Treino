package ex4;

public class CadastroCliente {
	private String nome;
	private String endereco;
	private int telefone;
	private int rg;
	private int cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void exibirDado() {
		javax.swing.JOptionPane.showMessageDialog(null, "CadastroCliente [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", rg=" + rg
				+ ", cpf=" + cpf + "]", "Dados", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}
}
