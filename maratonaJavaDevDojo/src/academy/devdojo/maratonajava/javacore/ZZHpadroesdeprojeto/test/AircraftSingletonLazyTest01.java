package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazy.getInstance());
        System.out.println(AircraftSingletonLazy.getInstance());
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getInstance();
        System.out.println(aircraftSingletonLazy.bookSeat(seat));
    }
}
