package net.unibave.funcionario;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class contrataçãoTest {

	ArrayList<funcionario> funcionarios=new ArrayList<>();
	funcionario f1=new funcionario();
	@BeforeEach
	void Limpa() {
		funcionario.setTotalFuncionarios(0);
	}

	@Test
	void  FuncionarioValidoTest() {
		f1.contratar("Rian", 21);
		funcionarios.add(f1);
		assertEquals(1, funcionario.getTotalFuncionarios());
	}
	@Test
	void FuncionarioInvalidoTest() {
		f1.contratar("Isabella", 12);
		funcionarios.add(f1);
		assertEquals(0, funcionario.getTotalFuncionarios());
	}
	
	@Test
	
    void contratarDiversosFuncionarios() {
        funcionario.contratar("Rian", 21);
        funcionario.contratar("Isabella", 12); // Não deve aumentar
        funcionario.contratar("Victor", 25);
        funcionario.contratar("Gabi", 21);
        assertEquals(3, funcionario.getTotalFuncionarios(), "O total de funcionários deve ser 2 após contratações válidas e inválidas.");
    }
	
}
