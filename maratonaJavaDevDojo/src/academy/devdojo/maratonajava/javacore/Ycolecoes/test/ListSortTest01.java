package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> seriesTV = new ArrayList<>(6);
        seriesTV.add("Dragon Ball Z");
        seriesTV.add("Sharivan");
        seriesTV.add("Power Rangers");
        seriesTV.add("VR Troopers");
        seriesTV.add("Gavan");

        // Para organizar a lista em ordem alfabética
        Collections.sort(seriesTV);

        List<Double> valores = new ArrayList<>();
        valores.add(45.67);
        valores.add(42.55);
        valores.add(13.13);
        valores.add(21.34);
        valores.add(14.12);
        Collections.sort(valores);

        for (Double valor : valores) {
            System.out.println(valor);
        }

        for (String series : seriesTV) {
            System.out.println(series);
        }
    }
}
