package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SeriesTv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SeriesTvComparator implements Comparator<SeriesTv> {

    @Override
    public int compare(SeriesTv outraSerieTv1, SeriesTv outraSerieTv2) {
        return outraSerieTv1.getId().compareTo(outraSerieTv2.getId());
    }
}

public class SeriesTvSortTest01 {
    public static void main(String[] args) {
        List<SeriesTv> seriesTvList = new ArrayList<>();
        seriesTvList.add(new SeriesTv(3L,"Death Note", 34.90));
        seriesTvList.add(new SeriesTv(4L,"Attack of Titans", 65.95));
        seriesTvList.add(new SeriesTv(1L,"Changeman", 9.93));
        seriesTvList.add(new SeriesTv(5L,"Cavaleiros do Zodíaco", 95.91));
        seriesTvList.add(new SeriesTv(2L,"Shurato", 19.59));
        System.out.println(seriesTvList);

        for (SeriesTv seriesTv : seriesTvList) {
            System.out.println(seriesTv);
        }

        Collections.sort(seriesTvList);
        System.out.println("--------------------------");
        for (SeriesTv seriesTv : seriesTvList) {
            System.out.println(seriesTv);
        }

        System.out.println("--------------------------");
        System.out.println("Utilizando o Comparator");
        seriesTvList.sort(new SeriesTvComparator());
        for (SeriesTv seriesTv : seriesTvList) {
            System.out.println(seriesTv);
        }
    }
}
