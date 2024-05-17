package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircarftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }
    private static void bookSeat(String seat){
        System.out.println(AircarftSingletonEnum.INSTANCE.hashCode());
        AircarftSingletonEnum aircarftSingletonEnum = AircarftSingletonEnum.INSTANCE;
        System.out.println(aircarftSingletonEnum.bookSeat(seat));
    }
}
