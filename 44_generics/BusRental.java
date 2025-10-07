import java.util.ArrayList;

class BusRental {
    ArrayList<Bus> buses = new ArrayList<>();

    void addBus(Bus bus) {
        buses.add(bus);
    }

    Bus rentBus() {
        return buses.remove(0);
    }
}
