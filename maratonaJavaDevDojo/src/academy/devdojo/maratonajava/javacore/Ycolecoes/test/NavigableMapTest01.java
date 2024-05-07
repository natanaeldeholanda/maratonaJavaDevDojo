package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("B", "Letra B");
        map.put("A", "Letra A");
        map.put("E", "Letra E");
        map.put("C", "Letra C");
        map.put("D", "Letra D");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }
        // Métodos:
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(map.headMap("C")); //Não mostra as chaves depois da declarada no headMap
        System.out.println(map.headMap("C", true));//Mostra as chaves anteriores, incluindo a declarada
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.ceilingKey("C"));
    }
}
