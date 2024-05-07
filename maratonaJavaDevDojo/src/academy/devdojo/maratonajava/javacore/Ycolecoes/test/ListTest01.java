package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16); // Capacidade inicial definida, porém a mesma vai acrescentando multiplicado pelo valor setado;
        List<String> nomes2 = new ArrayList<>(32);
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Natanael");
        nomes2.add("Wanessa");
        nomes2.add("Carneiro");
        nomes2.add("Natanael");

        nomes.addAll(nomes2);
        //nomes.remove("Pedro");
        //foreach
        for (String nome : nomes) {
            System.out.println(nome);
        }
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }
        nomes.add("Adicionando antes do for indexado");
        System.out.println(nomes);
    }
}
