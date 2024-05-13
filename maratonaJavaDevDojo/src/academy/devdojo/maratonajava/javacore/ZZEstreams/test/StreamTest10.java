package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        System.out.println("Método pra imprimir números sem limite ou usando .limit(5), imprime a quantidade de números. ");
        Stream.iterate(1, n -> n + 2).limit(5).forEach(System.out::println);
        //Mostrando sequência de fibonacci, agrupando os números;
        System.out.println("Mostrando sequência de fibonacci, agrupando os números");
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10).forEach(a -> System.out.println((Arrays.toString(a))));
        System.out.println("Mostrando sequência de fibonacci, no caso, 10 números: ");
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10).map(a -> a[0]).forEach(System.out::println);
        System.out.println("Gerando números aleatórios, de 01 a 500, com 10 números");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1,500)).limit(10).forEach(System.out::println);
    }
}
