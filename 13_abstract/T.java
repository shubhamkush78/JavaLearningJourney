abstract class Vehicle {

}

abstract class FourWheeler extends Vehicle {
    
}

abstract class ThreeWheeler extends Vehicle {

}

abstract class TwoWheeler extends Vehicle {

}

class Car extends FourWheeler {

}

class ThreeSeater extends ThreeWheeler {

}

class Scooter extends TwoWheeler {

}

class T {
    public static void main(String[] args) {
        new Car();

        // new Vehicle();  // not ok
    }
}
