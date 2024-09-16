package net.unibave.calculadora;

public class calculo {
	public double soma(double n1,double n2) {
	 return n1+n2;
	}
	
	public double subtrair(double n1,double n2) {
		return n1-n2;
	}
	
	public double divisao(double n1,double n2) {
		if(n2==0) {
			return 0;
		}
		return n1/n2;
	}
	
	public double vezes(double n1,double n2) {
		return n1*n2;
		
	}
	
	public double fatoracao(double n1,double n2) {
		return n1%n2;
	}
}
