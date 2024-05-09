package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Natanael de Holanda", "Wanessa Carneiro", "Raimundo Nonato", "Valdenira Costa"));
        list.sort(String::compareTo);
        System.out.println(list);
        //Transformando uma String em um Integer
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer integer = numStringToInteger.apply("123");
        System.out.println(integer);
        //Verifica se tem um elemento, em uma lista;
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Natanael de Holanda"));
    }
}
