package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.EcommerceRepository;

public class ProdutoController implements EcommerceRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorId(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO produto de id: " + numero + " não foi encontrado!");

	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto de id: " + produto.getId() + " foi cadastrado com sucesso!");
		
	}
	

	@Override
	public void alterar(Produto produto) {
		var buscaProduto = buscarNaCollection (produto.getId());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto de id: " + produto.getId() + " foi alterado com sucesso!");
		} else 
			System.out.println("\nO produto de id: " + produto.getId() + " não foi encontrado");

	}
	
	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) ==  true)
			System.out.println("\nO produto de id: " + numero + " foi deletado com sucesso!");
		} else System.out.println("\nO produto de id: " + numero + " não foi encontrado!");
		
		
	}


	
	public int gerarNumero () {
		return ++ numero;
	}
	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getId() == numero) {
				return produto;
			}
		}
		return null;
	}

	

	
}
