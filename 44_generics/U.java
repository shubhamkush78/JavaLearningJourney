class U {
    public static void main(String[] args) {
        CarRental x = new CarRental();
        x.addCar(new Car("maruti"));
        x.addCar(new Car("hyundai"));
        x.addCar(new Car("mahindra"));

        Car car = x.rentCar();

        System.out.println(car);
    }    
}