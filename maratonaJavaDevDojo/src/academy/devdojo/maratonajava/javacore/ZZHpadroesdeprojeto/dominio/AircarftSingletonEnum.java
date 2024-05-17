package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircarftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    AircarftSingletonEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return this.availableSeats.remove(seat);
    }
}
