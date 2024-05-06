package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SeriesTv;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
    Consumidor consumidor1 = new Consumidor("Natanael");
    Consumidor consumidor2 = new Consumidor("Wanessa");

        SeriesTv seriesTv1 = new SeriesTv(3L, "Death Note", 34.90);
        SeriesTv seriesTv2 = new SeriesTv(4L, "Attack of Titans", 65.95);
        SeriesTv seriesTv3 = new SeriesTv(1L, "Changeman", 9.93);
        SeriesTv seriesTv4 = new SeriesTv(5L, "Cavaleiros do Zodíaco", 95.91);
        SeriesTv seriesTv5 = new SeriesTv(2L, "Shurato", 19.59);

        Map<Consumidor, SeriesTv> consumidorSeriesTv = new HashMap<>();
        consumidorSeriesTv.put(consumidor1, seriesTv2);
        consumidorSeriesTv.put(consumidor2, seriesTv4);

        for(Map.Entry<Consumidor, SeriesTv> entry : consumidorSeriesTv.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
