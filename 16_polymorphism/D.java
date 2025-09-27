class D {
    public static void main(String[] args) {
        Object x = new SportsCar();  // polymorphic assignment

        
        if(x instanceof SportsCar) {
            System.out.println("SportsCar IS-A SportsCar");
        } else {
            System.out.println("SportsCar IS-NOT-A SportsCar");
        }
    }
}

