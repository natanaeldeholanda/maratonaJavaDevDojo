package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumerTest01 {
    public static void main(String[] args) {
        List<Integer> inteiros = List.of(1, 2, 3, 4, 5);
        forEachConsumer(inteiros, i-> System.out.println(i));

    }
    private static <T> void forEachConsumer(List <T> list, Consumer<T> consumer){
        for(T t : list){
            consumer.accept(t);
        }
    }
}
