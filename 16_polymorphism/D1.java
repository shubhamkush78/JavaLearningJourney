class D1 {
    public static void main(String[] args) {
        Object x = new SportsCar();  // polymorphic assignment

        
        if(x instanceof Car) {
            System.out.println("SportsCar IS-A Car");
        } else {
            System.out.println("SportsCar IS-NOT-A Car");
        }
    }
}

