package ecommerce.model;

public class Produto {
	
	private int id;
	private String nomeProduto;
	private float valor;
	private String material;
	public Produto(int id, String nomeProduto, float valor, String material) {
		this.id = id;
		this.valor = valor;
		this.material = material;
		this.nomeProduto = nomeProduto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public void visualizar () {
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto");
		System.out.println("***********************************************************");
		System.out.println("Número do ID: " + this.id);
		System.out.println("Nome do produto: " + this.nomeProduto);		
		System.out.println("Valor: " + this.valor);
		System.out.println("Material: " + this.material);
	}

}
