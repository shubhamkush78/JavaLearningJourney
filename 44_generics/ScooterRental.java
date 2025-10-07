import java.util.ArrayList;

class ScooterRental {
    ArrayList<Scooter> scooters = new ArrayList<>();

    void addScooter(Scooter scooter) {
        scooters.add(scooter);
    }

    Scooter rentScooter() {
        return scooters.remove(0);
    }
}
