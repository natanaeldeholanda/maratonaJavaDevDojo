package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SeriesTv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        SeriesTvComparator seriesTvBinarySort = new SeriesTvComparator();
        List<SeriesTv> seriesTvList = new ArrayList<>();
        seriesTvList.add(new SeriesTv(3L, "Death Note", 34.90));
        seriesTvList.add(new SeriesTv(4L, "Attack of Titans", 65.95));
        seriesTvList.add(new SeriesTv(1L, "Changeman", 9.93));
        seriesTvList.add(new SeriesTv(5L, "Cavaleiros do Zodíaco", 95.91));
        seriesTvList.add(new SeriesTv(2L, "Shurato", 19.59));

        seriesTvList.sort(seriesTvBinarySort);
        for (SeriesTv seriesTv : seriesTvList) {
            System.out.println(seriesTv);
        }
        SeriesTv cavaleirosDoZodiaco = new SeriesTv(5L, "Cavaleiros do Zodíaco", 95.91);
        System.out.println(Collections.binarySearch(seriesTvList, cavaleirosDoZodiaco, seriesTvBinarySort));
    }
}
