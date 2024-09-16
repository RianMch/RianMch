package net.unibave.livro;

public class Autor {
	private String nome;
	private String sexo;
	private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//cadastrar Autor 
	public void cadastrarAutor(String nome,String sexo,int idade) {
		setNome(nome);
		setSexo(sexo);
		setIdade(idade);
	}
	
	
	public String dados() {
		return "Nome:"+getNome()+"\n"+"Idade:"+getIdade()+"\n"+"Sexo:"+getSexo();
	}

}
