package ex2;

public class CadastroProduto {
	private String nome;
	private String tipoProd;
	private int qtde;
	private double valorUnitario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoProd() {
		return tipoProd;
	}
	public void setTipoProd(String tipoProd) {
		this.tipoProd = tipoProd;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public void exibirDados() {
		javax.swing.JOptionPane.showMessageDialog(null, "CadastroProduto [nome=" + nome + ", tipoProd=" + tipoProd + ", qtde=" + qtde + ", valorUnitario="
				+ valorUnitario + "]", "Dados!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}
}
