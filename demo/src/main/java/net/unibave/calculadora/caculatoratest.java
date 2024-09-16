package net.unibave.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class caculatoratest {

	calculo calcular = new calculo();

	@BeforeEach
	void Inicializar() {
	}

	@Test
	void somarTest() {
		double esperando = calcular.soma(1, 1);

		assertEquals(2, esperando);

	}
	
	@Test
	void DividirTest() {
		double esperando=calcular.divisao(20, 0);
		assertEquals(0, esperando);
	}
	
	
	@Test
	void subtrairTest() {
		double esperando=calcular.subtrair(2, 2);
		assertEquals(0, esperando);
	}
	
	@Test
	void vezesTest() {
		double esperando=calcular.vezes(2, 2);
		assertEquals(4, esperando);
	}
	
	@Test
	void FatoraçãoTest() {
		double esperando=calcular.fatoracao(3, 2);
		assertEquals(1, esperando);
	}
	@Test
	void calculoTest(){
		double esperando=calcular.soma(20, 2);
		esperando=calcular.subtrair(esperando, 3);
		esperando=calcular.vezes(esperando, 2);
		assertEquals(38, esperando);
	}
}
