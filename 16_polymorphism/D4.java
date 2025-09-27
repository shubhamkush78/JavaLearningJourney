class D4 {
    public static void main(String[] args) {
        Object x = new SportsCar();  // polymorphic assignment

        
        if(x instanceof Object) {
            System.out.println("SportsCar IS-A Object");
        } else {
            System.out.println("SportsCar IS-NOT-A Object");
        }
    }
}

