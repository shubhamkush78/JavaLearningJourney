class BB extends CoffeeMugSize {

}



enum CoffeeMugSize   {
    SMALL, MEDIUM, LARGE
}

// Q.java:1: error: cannot inherit from final CoffeeMugSize
// class BB extends CoffeeMugSize {
//                  ^
// Q.java:1: error: enum types are not extensible
// class BB extends CoffeeMugSize {
// ^
// 2 errors