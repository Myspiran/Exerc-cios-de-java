package Aula06_05;

public class Produto {
	
	private String nomeProduto;
	private int barras;
	private Funcionario funcionarioAtendeu;
	private int dataVencimento;
	
	public Produto() {
		
	}
	
	public Produto(String nomeProduto, int barras, int dataVencimento, Funcionario funcionarioAtendeu) {
		this.nomeProduto = nomeProduto;
		this.barras = barras;
		this.dataVencimento = dataVencimento;
		this.funcionarioAtendeu = funcionarioAtendeu; 
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public int getBarras() {
		return barras;
	}
	
	public void setBarras(int barras) {
		this.barras = barras;
	}
	
	public int getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(int dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public Funcionario getFuncionarioAtendeu() {
		return funcionarioAtendeu;
	}
	
	public void setFuncionarioAtendeu(Funcionario funcionarioAtendeu) {
		this.funcionarioAtendeu = funcionarioAtendeu;
	}
}
