package net.unibave.Remedio;

import net.unibave.pessoa;

public class MedicamentoRecomendado {
	private Medicamento medicamento=new Medicamento();
	private Pessoa pessoa=new Pessoa();
	
	
	public MedicamentoRecomendado(Pessoa pessoa,Medicamento medicamento) {
		this.pessoa=pessoa;
		this.medicamento=medicamento;
		
	}
	
	@Override
	public String toString() {
		if(pessoa.ISremedioIndicado(medicamento)) {
			return pessoa.getNome()+" - "+medicamento.getNome();
		}
		return pessoa.getNome()+" - "+medicamento.getNome();
	}
	
 


	public Medicamento getMedicamento() {
		return medicamento;
	}


	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
