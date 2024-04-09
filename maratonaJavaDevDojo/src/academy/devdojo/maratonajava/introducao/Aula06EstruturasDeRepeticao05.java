package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
	/*
	 * Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado. A
	 * condição é que valorParcela >= 1000
	 */
	public static void main(String[] args) {
		double valortotal = 30000;
		for (int parcela = (int) valortotal; parcela >= 1; parcela--) {
			double valorParcela = valortotal / parcela;
			if (valorParcela < 1000) {
				continue;
			}
			System.out.println("Parcela " + parcela + " R$ " + valorParcela);

		}
	}

}
