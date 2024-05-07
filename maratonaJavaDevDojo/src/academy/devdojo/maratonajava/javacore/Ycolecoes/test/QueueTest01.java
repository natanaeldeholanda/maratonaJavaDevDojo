package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    //Queue por padrão tem a característica FIFO
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");
        System.out.println("Organizando a fila: ");
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
