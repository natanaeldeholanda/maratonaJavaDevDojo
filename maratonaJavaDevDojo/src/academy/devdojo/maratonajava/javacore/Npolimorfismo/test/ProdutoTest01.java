package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Notebook;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel core I9", 9000);
        Tomate tomate = new Tomate("Tomate cereja", 5.99);
        Televisao tv = new Televisao("TCL 50\"", 1999);
        Notebook notebook = new Notebook("Asus", 4500);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(notebook);


    }
}
