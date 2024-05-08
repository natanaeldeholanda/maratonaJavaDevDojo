package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Pérola Negra"));
        List<Carro> carroList = criarArrayComUmObjeto(new Carro("Tiggo 7 Pro"));
        System.out.println(barcoList);
        System.out.println(carroList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

    //private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto (T t) {
    //return List.of(t);
    //}
}

