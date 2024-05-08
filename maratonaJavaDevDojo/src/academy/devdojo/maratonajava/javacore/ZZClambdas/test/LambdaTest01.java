package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        //LAMBDA MODELO CONSUMER
        //anonimas, é considerada como funções, ser um código mais conciso
        // lambdas: A interface tem que ser funcional, onde apenas um método abstrato.
        //(parametro) -> <expressão>
        // (Car car) -> car.getColor().equals("Green");
        List<String> strings = List.of("Natanael", "Holanda", "Luffy", "Zoro");
        forEach(strings, s -> System.out.println(s));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
