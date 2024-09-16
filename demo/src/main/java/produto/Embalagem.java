package produto;

public class Embalagem {
	
	
	private double tamanhoAltura;//altura x lagura x comprimento
	private double tamanhoLagura;
	private double tamanhocomprimento;
	private String tipo;
	private Produto produto = new Produto();

	public Embalagem(Produto produto, double tamanhoAltura, double tamanhoLagura,double tamanhocomprimento, String tipo) {
		this.produto = produto;
		this.tamanhocomprimento=tamanhocomprimento;
		this.tamanhoAltura = tamanhoAltura;
		this.tamanhoLagura = tamanhoLagura;
		this.tipo = tipo;

	}

	public Embalagem() {

	}
	

	public double getTamanhocomprimento() {
		return tamanhocomprimento;
	}

	public void setTamanhocomprimento(double tamanhocomprimento) {
		this.tamanhocomprimento = tamanhocomprimento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getTamanhoAltura() {
		return tamanhoAltura;
	}

	public void setTamanhoAltura(double tamanhoAltura) {
		this.tamanhoAltura = tamanhoAltura;
	}

	public double getTamanhoLagura() {
		return tamanhoLagura;
	}

	public void setTamanhoLagura(double tamanhoLagura) {
		this.tamanhoLagura = tamanhoLagura;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
