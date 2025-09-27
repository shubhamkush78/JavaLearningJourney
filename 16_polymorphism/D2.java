class D2 {
    public static void main(String[] args) {
        Object x = new SportsCar();  // polymorphic assignment

        
        if(x instanceof FourWheeler) {
            System.out.println("SportsCar IS-A FourWheeler");
        } else {
            System.out.println("SportsCar IS-NOT-A FourWheeler");
        }
    }
}

