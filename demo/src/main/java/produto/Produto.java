package produto;

public class Produto {
	private String nome;
	private String tipo;
	private double peso;
	private String sabor;
	public Produto() {
		
	}
	
	
	public Produto(String nome,String tipo,double peso,String sabor) {
		this.nome=nome;
		this.sabor=sabor;
		this.tipo=tipo;
		this.peso=peso;
	}
	
	
	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
