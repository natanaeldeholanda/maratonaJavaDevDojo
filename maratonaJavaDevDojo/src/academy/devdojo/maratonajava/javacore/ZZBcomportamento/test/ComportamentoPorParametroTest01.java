package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println(filterCarByColor(cars, "Green"));
        System.out.println(filterCarByAge(cars, 1999));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> byColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase(cor)) {
                byColor.add(car);
            }
        }
        return byColor;
    }

    private static List<Car> filterCarByAge(List<Car> cars, int year) {
        List<Car> byAge = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                byAge.add(car);
            }
        }
        return byAge;
    }

}
