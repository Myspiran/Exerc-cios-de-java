package Aula06_05;

public class Cliente {
	private String nomeCliente;
	private int contatoCliente;
	private int cpfCliente;
	private Produto Cod;
	
	public Cliente() {
		
	}
	
	public Cliente(String nomeCliente, int contatoCliente, int CpfCliente, Produto Cod) {
		this.nomeCliente = nomeCliente;
		this.contatoCliente = contatoCliente;
		this.cpfCliente = CpfCliente;
		this.Cod = Cod;
		
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public int getContato() {
		return contatoCliente;
	}
	
	public void setContato(int contatoCliente) {
		this.contatoCliente = contatoCliente;
	}
	
	public int getCpfCliente() {
		return cpfCliente;
	}
	
	public void setCpfCliente(int CpfCliente) {
		this.cpfCliente = CpfCliente;
	}
	
	public Produto getCod() {
		return Cod;
	}
	
	public void setCod(Produto Cod) {
		this.Cod = Cod;
	}
}
