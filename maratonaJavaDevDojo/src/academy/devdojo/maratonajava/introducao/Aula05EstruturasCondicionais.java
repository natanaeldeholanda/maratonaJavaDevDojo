package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {

	public static void main(String[] args) {
		int idade = 18;
		boolean isAutorizadoComprarBebida = idade >= 18;
		if (isAutorizadoComprarBebida) {
			System.out.println("Poosso comprar bebida alcóolica pois tenho: " + idade);
		} else {
			System.out.println("Não autorizado a comprar bebida, pois tenho: " + idade);
		}

		System.out.println("Fora do IF");
	}

}
