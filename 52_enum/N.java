enum CoffeeMugSize {
    SMALL, MEDIUM, LARGE
}

class N {
    public static void main(String[] args) {
        CoffeeMugSize mug = new CoffeeMugSize();        
    }    
}



// N.java:7: error: enum types may not be instantiated
//         CoffeeMugSize mug = new CoffeeMugSize();
//                             ^
// 1 error