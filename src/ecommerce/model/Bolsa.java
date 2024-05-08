package ecommerce.model;

public final class Bolsa extends Produto {

	private float altura;
	private float largura;
	private float profundidade;
	private String tamanho;
	private String cor;

	public Bolsa(int id, String nomeProduto, float valor, String material, float altura, float largura,
			float profundidade, String tamanho, String cor) {
		super(id, nomeProduto, valor, material);
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(float profundidade) {
		this.profundidade = profundidade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("Altura: " + this.altura);
		System.out.println("Largura: " + this.largura);
		System.out.println("Profundidade: " + this.profundidade);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Cor: " + this.cor);

	}

}
