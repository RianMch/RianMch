package net.unibave.Remedio;

import java.util.ArrayList;

public class Medicamento{
	private String nome;
	private String Administarcao;
	private ArrayList<String>ListaDEIndicacao=new ArrayList<>();
	
	
	//construtor com lista Arraylist
	public Medicamento(String nome,String administracao,ArrayList<String> ListaDEIndicacao) {
		this.nome=nome;
		this.Administarcao=administracao;
		this.ListaDEIndicacao=ListaDEIndicacao;
	}
	//Construtor sem arraylist
	public Medicamento(String nome,String administracao) {
		this.nome=nome;
		this.Administarcao=administracao;
		
	}
//	/construtor vazio
	public Medicamento() {
		
	}
	
	//Metodo para verificar se o medicamento é indicado para um sintona
	public boolean IsIndicacaoParaSintoma(String sintoma) {
		return ListaDEIndicacao.contains(sintoma);
	}
	
	
//	Getters & setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAdministarcao() {
		return Administarcao;
	}
	public void setAdministarcao(String administarcao) {
		Administarcao = administarcao;
	}
	public ArrayList<String> getListaDEIndicacao() {
		return ListaDEIndicacao;
	}
	public void setListaDEIndicacao(ArrayList<String> listaDEIndicacao) {
		ListaDEIndicacao = listaDEIndicacao;
	}

}
