package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natanael", "Allucard");
        List<Integer> integers = map(strings, String::length);
        List<String> uppercase = map(strings, String::toUpperCase);
        System.out.println("Tamanho dos nomes declarados: " + integers);
        System.out.println("Transformando os nomes em letras maiúsculas: " + uppercase);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
