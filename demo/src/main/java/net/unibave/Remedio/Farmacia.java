package net.unibave.Remedio;

import java.util.ArrayList;

public class Farmacia {
//	Arraylist 
	private ArrayList<Medicamento> medicamentos = new ArrayList<>();
	private ArrayList<Pessoa> pessoas = new ArrayList<>();
	private ArrayList<MedicamentoRecomendado> medicamentoRec = new ArrayList<>();

	public void cadastrarRemedio(String nome, String administracao, String sintoma) {
		ArrayList<String> ListSintoma = new ArrayList<>();
		ListSintoma.add(sintoma);
		medicamentos.add(new Medicamento(nome, administracao, ListSintoma));
	}

	public void addIndicacao(Medicamento medicamento, String sintoma) {
		for (Medicamento medi : medicamentos) {
			if(medi.equals(medicamento)) {
				medi.getListaDEIndicacao().add(sintoma);
			}

		}

	}

	public void cadastrarPessoa(String nome, String sintoma, int idade) {
		pessoas.add(new Pessoa(nome, sintoma, idade));
	}


	public void prescreverMedicamento(Pessoa pessoa, Medicamento medicamento) {
		if (pessoa.ISremedioIndicado(medicamento)) {
			medicamentoRec.add(new MedicamentoRecomendado(pessoa, medicamento));
		}
	}
	
	public void listarPrecricoes() {
		if(medicamentoRec.isEmpty()) {
		}else {
			for(MedicamentoRecomendado recomendacao:medicamentoRec) {
				System.out.println(recomendacao);
			}
		}
	}
	
	

	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public ArrayList<MedicamentoRecomendado> getMedicamentoRec() {
		return medicamentoRec;
	}

	public void setMedicamentoRec(ArrayList<MedicamentoRecomendado> medicamentoRec) {
		medicamentoRec = medicamentoRec;
	}

}
