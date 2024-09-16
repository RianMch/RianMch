package net.unibave.conta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class contaBancariaTest {
	ContaBancaria conta;
	
	@BeforeEach //ele começa o saldo 
	void saldoDaconta() {
		
		conta= new ContaBancaria(1000);
	}
	
	@Test
	void saquar() {
		conta.saquarConta(1000);
		assertEquals(0,conta.getSaldo());
	}
	
	@Test
	void deposita() {
		conta.depositarConta(100);
		assertEquals(1100,conta.getSaldo());
		
	}
	
	@Test
	void Verificar() {
		conta.issaldoSuficiente(-1);
		assertTrue(conta.issaldoSuficiente(100));
		assertFalse(conta.issaldoSuficiente(2000));
	}
	
	@Test
	void LogicaConta() {
		conta.saquarConta(200);
		conta.depositarConta(100);
		conta.saquarConta(1000);
		assertEquals(-100,conta.getSaldo());
	}
	

}
