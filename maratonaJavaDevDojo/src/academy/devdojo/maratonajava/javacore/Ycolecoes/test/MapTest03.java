package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SeriesTv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Natanael");
        Consumidor consumidor2 = new Consumidor("Wanessa");

        SeriesTv seriesTv1 = new SeriesTv(3L, "Death Note", 34.90);
        SeriesTv seriesTv2 = new SeriesTv(4L, "Attack of Titans", 65.95);
        SeriesTv seriesTv3 = new SeriesTv(1L, "Changeman", 9.93);
        SeriesTv seriesTv4 = new SeriesTv(5L, "Cavaleiros do Zodíaco", 95.91);
        SeriesTv seriesTv5 = new SeriesTv(2L, "Shurato", 19.59);

        List<SeriesTv> seriesTvConsumidor1List = List.of(seriesTv1, seriesTv2, seriesTv3);
        List<SeriesTv> seriesTvConsumidor2List = List.of(seriesTv4, seriesTv5);
        Map<Consumidor, List<SeriesTv>> consumidorSeriesTvMap = new HashMap<>();
        consumidorSeriesTvMap.put(consumidor1, seriesTvConsumidor1List);
        consumidorSeriesTvMap.put(consumidor2, seriesTvConsumidor2List);

        //For duplo onde no primeiro for, aparece o nome dos consumidores com os produtos que foram comprados
        //e o segundo for, é pra formatar, trazendo somente o nome da lista de série de tv
        for (Map.Entry<Consumidor, List<SeriesTv>> entry : consumidorSeriesTvMap.entrySet()) {
            System.out.println("--->" + entry.getKey().getNome());
            for (SeriesTv seriesTv : entry.getValue()) {
                System.out.println("----->" + seriesTv.getNome());
            }
        }
    }
}
