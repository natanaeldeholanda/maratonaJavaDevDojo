package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.SeriesTv;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    //Queue por padrão tem a característica FIFO
    public static void main(String[] args) {
        Queue<SeriesTv> seriesTvsQueue = new PriorityQueue<>(new SeriesTvComparator().reversed()); //Ordenando do maior valor para o menor
        seriesTvsQueue.add(new SeriesTv(3L, "Death Note", 34.90));
        seriesTvsQueue.add(new SeriesTv(4L, "Attack of Titans", 65.95));
        seriesTvsQueue.add(new SeriesTv(1L, "Changeman", 9.93));
        seriesTvsQueue.add(new SeriesTv(5L, "Cavaleiros do Zodíaco", 95.91));
        seriesTvsQueue.add(new SeriesTv(2L, "Shurato", 19.59));

        while (!seriesTvsQueue.isEmpty()) {
            System.out.println(seriesTvsQueue.poll());
        }
    }
}
