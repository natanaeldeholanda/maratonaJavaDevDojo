package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("key1", "value1");
        map.put("Teklado", "Teclado");
        map.put("Mause", "Mouse");
        map.put("Vc", "Você");
        map.putIfAbsent("Vc", "Você 2");
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println("----------------");
        for (String values : map.values()) {
            System.out.println(values);
        }
        System.out.println("----------------");
        // Pegando os valores do Key e do Value ao mesmo tempo
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }

    }
}
