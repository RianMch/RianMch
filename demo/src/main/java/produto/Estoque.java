package produto;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produto> produto = new ArrayList<>();
	private ArrayList<Embalagem> embalagem = new ArrayList<>();

	public void cadastrarProduto(String nome, String tipo, double peso, String sabor) {
		produto.add(new Produto(nome, tipo, peso, sabor));
	}

	public void cadastrarEmbalagem(Produto produto, double tamanhoAltura, double tamanhoLagura,
			double tamanhocomprimento, String tipo) {
		embalagem.add(new Embalagem(produto, tamanhoAltura, tamanhoLagura, tamanhocomprimento, tipo));

	}

	public void listaProduto() {
		for (Produto p : produto) {
			System.out.println(p.getNome() + " - " + p.getTipo() + " - " + p.getPeso() + " - " + p.getSabor());
		}
	}

	public void listaEmbalagem() {
		for (Embalagem e : embalagem) {
			System.out.println("Produto:" + e.getProduto().getNome() + " - " + e.getTamanhoAltura() + "x"
					+ e.getTamanhoLagura() + "x" + e.getTamanhocomprimento() + " - " + e.getTipo());
		}
	}

	public boolean buscarProduto(String nome) {
		for (Produto p : produto) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Encontrado");
				return true;

			}

		}
		return false;

	}
	public boolean buscarEmbalagem(String nome) {
		for (Embalagem e:embalagem) {
			if (e.getProduto().getNome().equalsIgnoreCase(nome)) {
				System.out.println("Encontrado");
				return true;

			}

		}
		return false;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}

	public ArrayList<Embalagem> getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(ArrayList<Embalagem> embalagem) {
		this.embalagem = embalagem;
	}

}
