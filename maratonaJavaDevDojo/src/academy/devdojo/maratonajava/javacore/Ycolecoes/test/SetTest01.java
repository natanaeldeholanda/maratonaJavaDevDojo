package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SeriesTv;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        //SET -> Não permite elementos duplicados dentro da coleção
        Set<SeriesTv> seriesTvSet = new LinkedHashSet<>();
        seriesTvSet.add(new SeriesTv(3L, "Death Note", 34.90, 0));
        seriesTvSet.add(new SeriesTv(4L, "Attack of Titans", 65.95, 5));
        seriesTvSet.add(new SeriesTv(1L, "Changeman", 9.93, 2));
        seriesTvSet.add(new SeriesTv(5L, "Cavaleiros do Zodíaco", 95.91, 0));
        seriesTvSet.add(new SeriesTv(2L, "Shurato", 19.59, 3));

        for (SeriesTv seriesTv : seriesTvSet) {
            System.out.println(seriesTv);
        }
    }
}
