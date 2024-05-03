package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("2CDE", "iPhone");
        Smartphone smartphone2 = new Smartphone("CDE2", "Pixel");
        Smartphone smartphone3 = new Smartphone("3ERT", "Samsung");


        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone smartphone4 = new Smartphone("3ERT", "Poco X5 Pro 5G");
        //System.out.println(smartphones.contains(smartphone4));
        int indexOfSmartphone4 = smartphones.indexOf(smartphone4);
        System.out.println(smartphones.get(indexOfSmartphone4));

    }
}
