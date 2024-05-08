package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("Black"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> byYearCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println("Retorno dos carros verdes: " + greenCars);
        System.out.println("Retorno dos carros vermelhos: " + redCars);
        System.out.println("Retorno dos carros pretos: " + blackCars);
        System.out.println("Retorno dos carros por ano: " + byYearCars);
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Imprimir os números pares, usando lambda
        System.out.println("Retorno de números pares de zero a 10: " + filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}