package net.unibave.conta;

public class ContaBancaria {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

//	saquar

	public boolean saquarConta(double saquar) {
		if (saquar > 0|| issaldoSuficiente(saquar)) {
			saldo -= saquar;
			return true;
		}
		return false;

	}

	public boolean depositarConta(double depositar) {
		if (depositar > 0) {
			saldo += depositar;
			return true;
		}
		return false;
	}
	
	public  boolean issaldoSuficiente(double valor) {
		return saldo>valor;
	}	
	
	

}
