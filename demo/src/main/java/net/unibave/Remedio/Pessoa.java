package net.unibave.Remedio;

public class Pessoa {
	private String nome;
	private String sintoma;
	private int idade;
	
	public Pessoa(String nome,String sintoma,int idade) {
		this.nome=nome;
		this.sintoma=sintoma;
		this.idade=idade;
		
	}
	public Pessoa() {
		
	}
	//mostrar a qual a fase da vida 
	@Override
	public String toString() {
		String p="Criança";
		if(idade>12&&idade<=18) {p="Adolecente";}
		if(idade>18&&idade<=30) {p="Jovem";}
		if(idade>30&&idade<=60) {p="Adulto";}
		if(idade>60) {p="Terceira Idade";}
		return nome + " - "+p;
	}
	
	//Metodo para verificar se um medimento é indicado para a pessoa 
	public boolean ISremedioIndicado(Medicamento medicamento) {
		return medicamento.IsIndicacaoParaSintoma(this.sintoma);
	}
	
	
	
//	Getters & setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
