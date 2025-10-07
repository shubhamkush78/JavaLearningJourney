class X {
    public static void main(String[] args) {
        // ScooterRental z = new ScooterRental();
        Rental<Scooter> z = new Rental<>();
        z.add(new Scooter("bajaj"));
        z.add(new Scooter("tvs"));
        z.add(new Scooter("yamaha"));
        // z.add(new Bus("yamaha"));
        // z.add(new Car("yamaha"));

        Scooter scooter = z.rent();

        System.out.println(scooter);

        // CarRental x = new CarRental();
        Rental<Car> x = new Rental<Car>();
        x.add(new Car("maruti"));
        x.add(new Car("hyundai"));
        x.add(new Car("mahindra"));
        // x.add(new Bus("mahindra"));
        // x.add(new Scooter("mahindra"));

        Car car = x.rent();

        System.out.println(car);

        // BusRental y = new BusRental();
        Rental<Bus> y = new Rental<>();
        y.add(new Bus("L&T"));
        y.add(new Bus("Tata"));
        y.add(new Bus("Volvo"));

        Bus bus = y.rent();

        System.out.println(bus);
    }    
}