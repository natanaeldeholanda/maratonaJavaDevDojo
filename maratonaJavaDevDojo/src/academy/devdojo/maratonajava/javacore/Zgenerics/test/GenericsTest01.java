package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List <String> lista = new ArrayList<>();
        lista.add("Goku");
        lista.add("Vegeta");

        for (String o : lista){
            System.out.println(o);
        }
    }
}
