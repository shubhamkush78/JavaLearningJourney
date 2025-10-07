class W {
    public static void main(String[] args) {
        ScooterRental z = new ScooterRental();
        z.addScooter(new Scooter("bajaj"));
        z.addScooter(new Scooter("tvs"));
        z.addScooter(new Scooter("yamaha"));

        Scooter scooter = z.rentScooter();

        System.out.println(scooter);

        
        CarRental x = new CarRental();
        x.addCar(new Car("maruti"));
        x.addCar(new Car("hyundai"));
        x.addCar(new Car("mahindra"));

        Car car = x.rentCar();

        System.out.println(car);

        BusRental y = new BusRental();
        y.addBus(new Bus("L&T"));
        y.addBus(new Bus("Tata"));
        y.addBus(new Bus("Volvo"));

        Bus bus = y.rentBus();

        System.out.println(bus);
    }    
}