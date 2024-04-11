package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		
		Carro citroen = new Carro ();
		Carro chevrolet = new Carro();
		
		citroen.nome = "C3";
		citroen.modelo = "Live Pack";
		citroen.ano = 2023;
		
		chevrolet.nome = "Onix";
		chevrolet.modelo = "LTZ";
		chevrolet.ano = 2023;
		
		System.out.printf("Tenho um carro de nome %s, modelo %s, ano fabricação:%d\n", citroen.nome, citroen.modelo, citroen.ano);
		System.out.printf("Minha esposa tem um %s, modelo %s, ano de fabricação:%d", chevrolet.nome, chevrolet.modelo, chevrolet.ano);
		
	}

}
