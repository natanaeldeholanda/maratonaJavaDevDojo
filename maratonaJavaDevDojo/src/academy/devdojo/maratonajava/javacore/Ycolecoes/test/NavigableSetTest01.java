package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SeriesTv;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class SeriesTvPrecoComparator implements Comparator<SeriesTv> {

    @Override
    public int compare(SeriesTv o1, SeriesTv o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);
        System.out.println("---------------------------");
        NavigableSet<SeriesTv> seriesTvList = new TreeSet<>(new SeriesTvPrecoComparator());
        seriesTvList.add(new SeriesTv(3L,"Death Note", 34.90));
        seriesTvList.add(new SeriesTv(4L,"Attack of Titans", 65.95));
        seriesTvList.add(new SeriesTv(1L,"Changeman", 9.93));
        seriesTvList.add(new SeriesTv(5L,"Cavaleiros do Zodíaco", 95.91));
        seriesTvList.add(new SeriesTv(2L,"Shurato", 19.59));
        for (SeriesTv seriesTv : seriesTvList) {
            System.out.println(seriesTv);
        }

        // Métodos para comparação
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        SeriesTv dragonballz = new SeriesTv(21L, "Dragon Ball Z", 14.5, 5);
        System.out.println("--------------------------");
        System.out.println(seriesTvList.lower(dragonballz));
        System.out.println(seriesTvList.floor(dragonballz));
        System.out.println(seriesTvList.higher(dragonballz));
        System.out.println(seriesTvList.ceiling(dragonballz));
        System.out.println("--------------------------");
        System.out.println(seriesTvList.size());
        System.out.println(seriesTvList.pollFirst());
        System.out.println(seriesTvList.pollLast());

    }
}
