package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
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
        System.out.println("----------------");
        int size = nomes.size();
        for(int i = 0; i < size; i++){
            nomes.add("Adicionando antes do for indexado");
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);
    }
}
