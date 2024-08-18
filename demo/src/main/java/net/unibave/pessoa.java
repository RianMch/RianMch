package net.unibave;

public class pessoa {
	private String nome;
	private int nmrCamisa;
	private int qtddDeGol;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNmrCamisa() {
		return nmrCamisa;
	}
	public void setNmrCamisa(int nmrCamisa) {
		if(nmrCamisa<=1)
		this.nmrCamisa = nmrCamisa;
	}
	public int getQtddDeGol() {
		return qtddDeGol;
	}
	public void setQtddDeGol(int qtddDeGol) {
		if(qtddDeGol<=0)
		this.qtddDeGol = qtddDeGol;
	}

}
