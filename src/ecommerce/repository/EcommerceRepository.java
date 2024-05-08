package ecommerce.repository;

import ecommerce.model.Produto;

public interface EcommerceRepository {

	public void procurarPorId(int numero);
	public void listarTodos();
	public void cadastrar (Produto produto);
	public void alterar (Produto produto);
	public void deletar (int numero);
}
