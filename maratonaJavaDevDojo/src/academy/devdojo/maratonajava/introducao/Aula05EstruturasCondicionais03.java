package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {

	public static void main(String[] args) {
		// OPERADOR TERNÁRIO
		// (condicao) ? verdadeiro : falso;
		// Doar se salário for > 5000;
		double salario = 6000;
		String mensagemDoar = "Eu vou doar 500 pro DevDojo!";
		String mensagemNaoDoar = "Ainda não tenho condições mais vou ter!";
		
		// como se lê: se salario for maior que 5000, eu vou doar, senão, não vou doar
		String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; 
		
		
		System.out.println(resultado);
	}

}
