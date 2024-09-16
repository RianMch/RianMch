package net.unibave.funcionario;

public class funcionario {
    private static int totalFuncionarios = 0;
    public static void setTotalFuncionarios(int totalFuncionarios) {
		funcionario.totalFuncionarios = totalFuncionarios;
	}

	private static final int idadeMinima = 18;

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public static int getIdadeMinima() {
        return idadeMinima;
    }



    public static funcionario contratar(String nome, int idade) {
        if (idade >= idadeMinima) {
            totalFuncionarios++;
            System.out.println("Funcionário " + nome + " contratado com sucesso.");
        } else {
            System.out.println("Não pode ser contratado devido à idade.");
        }
		return null;
    }
}
