package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

public interface CarPredicate {
    //anonimas, é considerada funções, ser um código mais conciso
    boolean test(Car car);
    // lambdas: A interface tem que ser funcional, onde apenas um método abstrato.
    //(parametro) -> <expressão>
    // (Car car) -> car.getColor().equals("Green");
}
