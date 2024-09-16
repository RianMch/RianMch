package net.unibave.livro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Registrotest {
	private Livro livro;
    private Autor autor1;
    private Autor autor2;

    @BeforeEach
    public void setUp() {
        livro = new Livro();
        autor1 = new Autor();
        autor1.cadastrarAutor("João Silva", "Masculino", 30);
        autor2 = new Autor();
        autor2.cadastrarAutor("Maria Oliveira", "Feminino", 25);
    }

    @Test
    public void testCadastrarLivro() {
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        livro.cadastrarLivro("Aprendendo Java", 49.90, 300, autores);

        assertEquals("aprendendo java", livro.getTitulo());
        assertEquals(49.90, livro.getValor());
        assertEquals(300, livro.getQtddDePag());
        assertEquals(1, livro.getAutores().size());
        assertEquals(autor1, livro.getAutores().get(0));
    }

    @Test
    public void testAdicionarAutor() {
        livro.cadastrarLivro("Aprendendo Java", 49.90, 300, new ArrayList<>());
        livro.adicionarAutor(autor1);
        livro.adicionarAutor(autor2);

        assertEquals(2, livro.getAutores().size());
        assertTrue(livro.getAutores().contains(autor1));
        assertTrue(livro.getAutores().contains(autor2));
    }

    @Test
    public void testAdicionarAutorLimite() {
        livro.cadastrarLivro("Aprendendo Java", 49.90, 300, new ArrayList<>());
        livro.adicionarAutor(autor1);
        livro.adicionarAutor(autor2);

        // Adicionando mais autores além do limite
        livro.adicionarAutor(new Autor());
        livro.adicionarAutor(new Autor());

        assertEquals(2, livro.getAutores().size(), "Não deve adicionar mais de 4 autores.");
    }

    @Test
    public void testSetValor() {
        livro.setValor(-10.0);
        assertEquals(0, livro.getValor(), "O valor deve ser maior que 0.");

        livro.setValor(50.0);
        assertEquals(50.0, livro.getValor(), "O valor deve ser 50.0.");
    }

    @Test
    public void testSetQtddDePag() {
        livro.setQtddDePag(-10);
        assertEquals(0, livro.getQtddDePag(), "A quantidade de páginas deve ser maior que 0.");

        livro.setQtddDePag(250);
        assertEquals(250, livro.getQtddDePag(), "A quantidade de páginas deve ser 250.");
    }

	
	
	

}
