package ecommerce.model;

public final class Relogio extends Produto {

	private String corPulseira;
	private String corMostrador;
	private String tipo;

	public Relogio(int id, String nomeProduto, float valor, String material, String corPulseira, String corMostrador,
			String tipo) {
		super(id, nomeProduto, valor, material);
		this.corPulseira = corPulseira;
		this.corMostrador = corMostrador;
		this.tipo = tipo;
	}

	public String getCorPulseira() {
		return corPulseira;
	}

	public void setCorPulseira(String corPulseira) {
		this.corPulseira = corPulseira;
	}

	public String getCorMostrador() {
		return corMostrador;
	}

	public void setCorMostrador(String corMostrador) {
		this.corMostrador = corMostrador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("Cor da Pulseira: " + this.corPulseira);
		System.out.println("Cor do Mostrador: " + this.corMostrador);
		System.out.println("Tipo: " + this.tipo);

	}

}
