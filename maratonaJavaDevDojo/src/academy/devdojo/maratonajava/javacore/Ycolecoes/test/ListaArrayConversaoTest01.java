package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> numerosListaArray = Arrays.asList(numerosArray);
        numerosListaArray.set(0, 4);
        System.out.println(Arrays.asList(numerosArray));
        System.out.println(numerosListaArray);

        System.out.println("--------------------");
        List <Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(5);
        System.out.println(numerosList);
    }
}
