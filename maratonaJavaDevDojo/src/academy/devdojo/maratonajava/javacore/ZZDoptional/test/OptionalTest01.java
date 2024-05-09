package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Aha uhu o DevDojo é foda!");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println("------------------");
        Optional<String> nameOptional = ((findName("Natanael de Holanda")));
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(nameOptional);
        System.out.println(empty);

    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Natanael de Holanda");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
