package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Soma dos números: ");
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println); // soma todos os números declarados;
        System.out.println("Multiplicação dos números: ");
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println); // multiplica todos os números declarados;
        System.out.println("Soma dos números: ");
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y)); // outra forma de somar todos os números declarados, na multiplicação o identity tem que iniciar com 1;
        System.out.println("Soma dos números usando o método sum: ");
        System.out.println(integers.stream().reduce(0, Integer::sum)); // soma todos os números declarados, com o método sum;
        System.out.println("Trazer o maior número: ");
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println); // traz o maior número usando operação ternária;
        integers.stream().reduce(Integer::max).ifPresent(System.out::println); // traz o maior número

    }
}
