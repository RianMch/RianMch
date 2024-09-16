package net.unibave;

public class time {
	private String nomeTime;
	private String[] time=new String[12];
	private String[] reversa=new String[20];
	public String[] getReversa() {
		return reversa;
	}
	public void setReversa(String[] reversa) {
		this.reversa = reversa;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public String[] getTime() {
		return time;
	}
	public void setTime(String[] time) {
		this.time = time;
	}
}
