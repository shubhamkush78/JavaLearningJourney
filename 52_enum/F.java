enum CoffeeMugSize {
    SMALL, MEDIUM, LARGE
}

class F {
    public static void main(String[] args) {
        CoffeeMugSize x = SMALL;
    }    
}


// F.java:7: error: cannot find symbol
//         CoffeeMugSize x = SMALL;
//                           ^
//   symbol:   variable SMALL
//   location: class F
// 1 error