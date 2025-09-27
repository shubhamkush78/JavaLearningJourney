class D3 {
    public static void main(String[] args) {
        Object x = new SportsCar();  // polymorphic assignment

        
        if(x instanceof Vehicle) {
            System.out.println("SportsCar IS-A Vehicle");
        } else {
            System.out.println("SportsCar IS-NOT-A Vehicle");
        }
    }
}

