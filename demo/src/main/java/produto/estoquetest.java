package produto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class estoquetest {
		private Estoque estoque=new Estoque();

	@BeforeEach
	void inicializador() {
		estoque.getEmbalagem().clear();
		estoque.getProduto().clear();
		estoque.cadastrarProduto("Paleta","Fatiado", 2.0, "Bacon");
		estoque.cadastrarProduto("Pernil","Fatiado", 2.0, "Bacon");
		estoque.cadastrarProduto("Linguiça suina","Embutido", 0.8, "Suino");
		estoque.cadastrarProduto("Lombo canadense","Fatiado", 2.0, "Defumando");
		estoque.cadastrarProduto("Lombo canadense","Embutido", 3.0, "Defumando");
	}
	
	
	
	@Test
	void CadastraTest() {
		estoque.cadastrarEmbalagem(estoque.getProduto().get(0), 1, 1, 1,"Plástico");
		estoque.cadastrarEmbalagem(estoque.getProduto().get(1), 1, 1, 1,"Plástico");
		estoque.cadastrarEmbalagem(estoque.getProduto().get(2), 1, 1, 1,"Plástico");
		estoque.cadastrarEmbalagem(estoque.getProduto().get(3), 1, 1, 1,"Plástico");
		estoque.cadastrarEmbalagem(estoque.getProduto().get(4), 1, 1, 1,"Plástico");
		assertEquals(5,estoque.getEmbalagem().size());
	}
	@Test
	void CadastrarErrado() {
		estoque.cadastrarEmbalagem(estoque.getProduto().get(0), 1, 1, 1,"Plástico");
		estoque.cadastrarEmbalagem(estoque.getProduto().get(1), 1, 1, 1,"Plástico");
		estoque.cadastrarEmbalagem(estoque.getProduto().get(2), 1, 1, 1,"Plástico");
		estoque.cadastrarEmbalagem(estoque.getProduto().get(3), 1, 1, 1,"Plástico");
		estoque.cadastrarEmbalagem(estoque.getProduto().get(5), 1, 1, 1,"Plástico");
		
		
		assertEquals(4,estoque.getEmbalagem().size());
		
	}
	
	

}
