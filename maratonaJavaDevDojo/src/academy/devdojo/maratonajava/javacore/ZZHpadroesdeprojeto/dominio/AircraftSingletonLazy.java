package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {

    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String nameAircraft;

    private AircraftSingletonLazy(String nameAircraft) {
        this.nameAircraft = nameAircraft;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
//Método quando se trabalha em multiplos threads, evitando que a mesma poltrona seja vendida mais de uma vez;
    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
