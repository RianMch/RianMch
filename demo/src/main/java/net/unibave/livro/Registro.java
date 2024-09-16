package net.unibave.livro;

import java.util.ArrayList;

public class Registro {
    private static ArrayList<Livro> livros = new ArrayList<>();

    // Método para formatar os dados de um livro
    private static String Dados(Livro livro) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Título: ").append(livro.getTitulo()).append(" | Valor: R$")
                .append(String.format("%.2f", livro.getValor())).append(" | Quantidade de Páginas: ")
                .append(livro.getQtddDePag()).append("\n");

        for (Autor a : livro.getAutores()) {
            resultado.append("  Autor: ").append(a.getNome()).append(" | Idade: ").append(a.getIdade())
                    .append(" | Sexo: ").append(a.getSexo()).append("\n");
        }
        resultado.append("\n");
        return resultado.toString();
    }

    // Listar todos os livros
    public String listarTodos() {
        StringBuilder resultado = new StringBuilder();
        for (Livro l : livros) {
            resultado.append(Dados(l));
        }
        if (resultado.length() == 0) {
            return "Nenhum livro cadastrado.";
        }
        return resultado.toString();
    }

    // Buscar livros por autor
    public String buscarPorAutor(String nome) {
        StringBuilder resultado = new StringBuilder();
        for (Livro l : livros) {
            for (Autor a : l.getAutores()) {
                if (a.getNome().equalsIgnoreCase(nome)) {
                    resultado.append(Dados(l));
                    break; // Encontrou o autor, não precisa verificar os outros autores do livro
                }
            }
        }

        if (resultado.length() == 0) {
            return "Nenhum livro encontrado para o autor: " + nome;
        }
        return resultado.toString();
    }

    // Buscar livros por faixa de preço
    public String faixaDePreco(double min, double max) {
        StringBuilder resultado = new StringBuilder();
        for (Livro l : livros) {
            if (l.getValor() >= min && l.getValor() <= max) {
                resultado.append(Dados(l));
            }
        }
        if (resultado.length() == 0) {
            return "Nenhum livro encontrado na faixa de preço de R$" + min + " a R$" + max;
        }
        return resultado.toString();
    }

    // Buscar livros por idade do autor
    public String idadeAutor(int idade) {
        StringBuilder resultado = new StringBuilder();
        for (Livro l : livros) {
            for (Autor a : l.getAutores()) {
                if (a.getIdade() == idade) {
                    resultado.append(Dados(l));
                    break; // Encontrou o autor com a idade, não precisa verificar os outros autores do livro
                }
            }
        }
        if (resultado.length() == 0) {
            return "Nenhum livro encontrado com autores de idade: " + idade;
        }
        return resultado.toString();
    }

    // Buscar livros por sexo dos autores
    public String buscarPorSexo(String sexo) {
        StringBuilder resultado = new StringBuilder();
        for (Livro l : livros) {
            for (Autor a : l.getAutores()) {
                if (a.getSexo().equalsIgnoreCase(sexo)) {
                    resultado.append(Dados(l));
                    break; // Encontrou um autor com o sexo, não precisa verificar os outros autores do livro
                }
            }
        }
        if (resultado.length() == 0) {
            return "Nenhum livro encontrado com autores do sexo: " + sexo;
        }
        return resultado.toString();
    }

    // Métodos para adicionar livros
    public static void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
}
