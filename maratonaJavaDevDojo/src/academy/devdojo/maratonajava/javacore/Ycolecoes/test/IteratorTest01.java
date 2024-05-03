package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SeriesTv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<SeriesTv> seriesTvList = new LinkedList<>();
        seriesTvList.add(new SeriesTv(3L, "Death Note", 34.90, 0));
        seriesTvList.add(new SeriesTv(4L, "Attack of Titans", 65.95, 5));
        seriesTvList.add(new SeriesTv(1L, "Changeman", 9.93, 2));
        seriesTvList.add(new SeriesTv(5L, "Cavaleiros do Zodíaco", 95.91, 0));
        seriesTvList.add(new SeriesTv(2L, "Shurato", 19.59, 3));
//        Iterator<SeriesTv> seriesTvIterator = seriesTvList.iterator();
////        while (seriesTvIterator.hasNext()) {
////            SeriesTv seriesTv = seriesTvIterator.next();
////            if(seriesTv.getQuantidade() == 0){
////                seriesTvIterator.remove();
////            }
////        }
        // Código para remover a série cujo o atributo quantidade for igual a zero, usando operador de seta (lambda)
        seriesTvList.removeIf(seriesTv -> seriesTv.getQuantidade() == 5);
        System.out.println(seriesTvList);
    }
}
