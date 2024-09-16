package net.unibave.Remedio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.unibave.pessoa;

class FarmaciaTest {
	
	private Farmacia farmacia=new Farmacia();

	@BeforeEach
	void inicializar() {
		farmacia.getMedicamentoRec().clear();
		farmacia.getMedicamentos().clear();
		farmacia.getPessoas().clear();
		farmacia.cadastrarRemedio("Paracetamol", "Oral","Dor de cabeça");//0
		farmacia.cadastrarRemedio("Ibuprofeno", "Oral","Inflamação");//1
		farmacia.cadastrarRemedio("Amoxicilina","oral","Infecçoes bacterianas");//2
		farmacia.cadastrarRemedio("Diclofenaco", "Injetável","Inflamação");//3
		farmacia.cadastrarRemedio("Pomada de Hidrocortisona", "Tópico","Coceira");//4
		farmacia.cadastrarPessoa("João", "Dor de cabeça", 25);//0
		farmacia.cadastrarPessoa("Maria", "Inflamação nas articulações", 55);//1
		farmacia.cadastrarPessoa("Carlos", "Febre", 40);//2
		farmacia.cadastrarPessoa("Ana", "Infecção bacteriana", 30);//3
		farmacia.cadastrarPessoa("Pedro", "Coceira e erupções cutâneas", 10);//4
	}
	
	@Test
	void PrecreverMedicamento() {
		Pessoa joao=farmacia.getPessoas().get(0);
		Medicamento paracetamol=farmacia.getMedicamentos().get(0);
		farmacia.prescreverMedicamento(joao, paracetamol);
		assertEquals(1, farmacia.getMedicamentoRec().size());
		assertTrue(farmacia.getMedicamentoRec().get(0).toString().contains("João - Paracetamol"));
	}
	
	@Test
	void PrecreverMedicamentoErrado() {
		Pessoa joao=farmacia.getPessoas().get(0);
		Medicamento ibuprofeno=farmacia.getMedicamentos().get(1);
		farmacia.prescreverMedicamento(joao, ibuprofeno);
		assertEquals(0,farmacia.getMedicamentoRec().size());
		
	}
	
	@Test
	void Adicionar() {
		Medicamento paracetamol=farmacia.getMedicamentos().get(0);
		farmacia.addIndicacao(paracetamol, "Febre");
		Pessoa carlos=farmacia.getPessoas().get(2);
		Pessoa joao=farmacia.getPessoas().get(0);
		farmacia.prescreverMedicamento(joao, paracetamol);
		farmacia.prescreverMedicamento(carlos, paracetamol);
		assertEquals(2, farmacia.getMedicamentoRec().size());
		
	}
	
	@Test
	void cadastrarPessoa() {
		farmacia.cadastrarPessoa("Juninho","Febre", 12);//5
		farmacia.addIndicacao(farmacia.getMedicamentos().get(0), "Febre");
		farmacia.prescreverMedicamento(farmacia.getPessoas().get(5),farmacia.getMedicamentos().get(0));
		assertEquals(6, farmacia.getPessoas().size());
		assertTrue(farmacia.getMedicamentoRec().get(0).toString().contains(" - Paracetamol"));
		
	}
	
	@Test
	void cadastrarRemedio() {
		farmacia.cadastrarRemedio("Ecofilm", "Tópico", "Coceira no Olho");
		assertEquals(6,farmacia.getMedicamentos().size());
	}
	@Test
	void Precrever() {
		Pessoa joao=farmacia.getPessoas().get(0);
		Medicamento ibuprofeno=farmacia.getMedicamentos().get(1);
		farmacia.prescreverMedicamento(joao, ibuprofeno);
		
		farmacia.prescreverMedicamento(farmacia.getPessoas().get(0), farmacia.getMedicamentos().get(0));
		farmacia.listarPrecricoes();
		
	}
	
	
	

}
