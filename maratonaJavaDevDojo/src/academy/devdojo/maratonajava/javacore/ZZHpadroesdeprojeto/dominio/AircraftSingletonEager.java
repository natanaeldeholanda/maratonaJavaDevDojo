package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    //Eager inicialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String nameAircraft;

    private AircraftSingletonEager(String nameAircraft) {
        this.nameAircraft = nameAircraft;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

public static AircraftSingletonEager getInstance() {
        return INSTANCE;
}

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
