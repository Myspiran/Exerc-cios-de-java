package Aula06_05;

public class Funcionario {
	private String funcionario;
	private int cpfFuncionario;
	private int carteiraTrabalho;
	protected int dataAtendimento;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String funcionario, int cpfFuncionario, int carteiraTrabalho, int dataAtendimento) {
		this.funcionario = funcionario;
		this.cpfFuncionario = cpfFuncionario;
		this.carteiraTrabalho = carteiraTrabalho;
		this.dataAtendimento = dataAtendimento;
	}
	
	public String getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	
	public int getCpfFuncionario() {
		return cpfFuncionario;
	}
	
	public void setCpfFuncionario(int cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	
	public int getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	
	public void setCarteiraTrabalho(int carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
}
