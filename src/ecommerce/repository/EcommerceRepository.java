package ecommerce.repository;

import ecommerce.model.Produto;

public interface EcommerceRepository {

	public void procurarPorId(int numero);
	public void listarTodos();
	public void cadastrar ();
	public void alterar ();
	public void deletar ();
	
	
}
