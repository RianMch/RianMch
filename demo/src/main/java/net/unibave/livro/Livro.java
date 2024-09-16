package net.unibave.livro;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private double valor;
    private int qtddDePag;
    private ArrayList<Autor> autores = new ArrayList<>(4);

    // Getters e setters
    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        if (autores.size() > 0 && autores.size() <= 4) {
            this.autores = autores;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }

    public int getQtddDePag() {
        return qtddDePag;
    }

    public void setQtddDePag(int qtddDePag) {
        if (qtddDePag > 0) {
            this.qtddDePag = qtddDePag;
        }
    }

    // Cadastrar livro
    public void cadastrarLivro(String titulo, double valor, int qtddDePag, ArrayList<Autor> autores) {
        setTitulo(titulo.toLowerCase()); // Assim tudo vai ser marcado com letra minúscula
        setValor(valor);
        setQtddDePag(qtddDePag);
        setAutores(autores);
    }

    // Adicionar autor
    public void adicionarAutor(Autor novoAutor) {
        if (autores.size() < 4) {
            autores.add(novoAutor);
        } else {
            System.out.println("Não é possível adicionar mais autores. O limite é 4.");
        }
    }
}
