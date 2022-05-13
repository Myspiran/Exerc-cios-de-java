package Aula06_05;

import java.util.ArrayList;
import java.util.List;
import Aula06_05.Produto;
import Aula06_05.Cliente;
import Aula06_05.Funcionario;
import Aula06_05.Registro;


public class Lojinha implements CrudProduto {
	
	ArrayList<Produto> lojinhaProduto = new ArrayList<Produto>();
	
	@Override
	public void Adicionar(Produto x) {
		lojinhaProduto.add(x);
		System.out.println(x + "Produtos a serem comprados");
		
	}

	@Override
	public void Remover(Produto y) {
		lojinhaProduto.remove(y);
		
	}

	@Override
	public void Procurar(Produto z) {
		if(lojinhaProduto.size() == 0) {
			System.out.println("Nada para ser comprado!");
		}
		else {
			for(int i = 0; i < lojinhaProduto.size(); i++) {
				System.out.println("===>" + lojinhaProduto.get(i).getNomeProduto());
				System.out.println("===>" + lojinhaProduto.get(i).getBarras());
			}
		}
	}
	
}
