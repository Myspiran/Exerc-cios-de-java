package Aula06_05;

import java.util.ArrayList;
import java.util.Scanner;
import Aula06_05.Lojinha;
import Aula06_05.Funcionario;
import Aula06_05.Registro;
import Aula06_05.Cliente;
import Aula06_05.CrudProduto;
import Aula06_05.Produto;

public class Main  {
	
	public static void main(String[] args) {
		
		ArrayList<Produto> lojinhaProduto = new ArrayList<Produto>();
		Cliente cli = new Cliente();
		Produto PD = new Produto();
		
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, bem vindo(a) a Lojinha");
		System.out.println("Eu sou: ");
		String fun = sc.nextLine();
		
		System.out.println("Oque deseja?");
		System.out.println("Deseja adicionar um produto?");
		String x = sc.nextLine();
		System.out.println("Deseja remover produto?");
		String y = sc.nextLine();
		System.out.println("Deseja procurar algum produto?");
		String z = sc.nextLine();
		
		for(int i = 0; i <= n; i++) {
				if(x == "não") {
				sc.close();
				}
				else if(x == "sim") {
				lojinhaProduto.add(PD);
					n++;
					if(n == 1) {
					System.out.println("Produto: " );
					String nomeProduto = sc.nextLine();
					System.out.println("Código de barras: ");
					Integer barras = sc.nextInt();
					System.out.println("Data de vencimento: ");
					Integer dataVencimento = sc.nextInt();
					System.out.println("Funcionario que atendeu: " + fun);
					}
				}	
				else if(y == "sim") {
					lojinhaProduto.remove(n);
				}
				else if(y == "não") {
					continue;
				}
				else if(z == "sim") {
					System.out.println(PD);
				}
				else if(z == "não") {
					continue;
				}
			}
		
		sc.close();
	}

}
