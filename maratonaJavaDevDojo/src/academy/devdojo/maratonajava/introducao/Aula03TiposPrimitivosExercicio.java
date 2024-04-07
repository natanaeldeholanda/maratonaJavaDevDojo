package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
	/*
	 * Prática Crie variáveis para os campos descritos abaixo entre < > e imprima a
	 * seguinte mensagem:
	 * 
	 * Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de
	 * <salario> na data. <data>
	 */

	public static void main(String[] args) {
		String nome = "Natanael";
		String endereco = "Rua Titi Nº 136";
		String dataRecebimentoSalario = "07/04/2024";
		double salario = 4840.00;
		String relatorio = ("Eu " + nome + ", morando no endereço, " + endereco
				+ ", confirmo que recebi o salario de R$" + salario + ", na data de " + dataRecebimentoSalario + ".");
		System.out.println(relatorio);

	}

}
