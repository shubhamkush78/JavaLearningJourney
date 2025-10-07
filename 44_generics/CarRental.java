import java.util.ArrayList;

class CarRental {
    ArrayList<Car> cars = new ArrayList<>();

    void addCar(Car car) {
        cars.add(car);
    }

    Car rentCar() {
        return cars.remove(0);
    }
}