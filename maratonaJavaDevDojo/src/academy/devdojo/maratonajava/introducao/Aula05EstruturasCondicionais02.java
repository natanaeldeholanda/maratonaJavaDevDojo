package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

	public static void main(String[] args) {
		// idade < 15 categoria juvenil
		// idade >= 15 && idade < 18 categoria juvenil
		// idade >= 18 && idade < 18 categoria adulto
		int idade = 19;
		String categoria;
		if (idade < 15) {
			categoria = "Categoria infantil " + idade;
		} else if (idade >= 15 && idade < 18) {
			categoria =  "Categoria juvenil " + idade;
		} else {
			categoria = "Categoria adulto " + idade;
		}
		System.out.println(categoria);

	}

}
