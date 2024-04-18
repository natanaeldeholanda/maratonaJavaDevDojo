package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        // Variável de refer6encia produto e um objeto do tipo Computador.
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calculaTaxa());
        System.out.println("-----------------------------");
        Produto tomate = new Tomate("Tomate verde", 7.99);
        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
        System.out.println(tomate.calculaTaxa());

    }
}
