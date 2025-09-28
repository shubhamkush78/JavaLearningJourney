class Y6 {
    Animal info() {
        return null;
    }
}

class H3 extends Y6 {
    LivingBeing info() {
        return null;
    }
}


// H3.java:8: error: info() in H3 cannot override info() in Y6
//     LivingBeing info() {
//                 ^
//   return type LivingBeing is not compatible with Animal
// 1 error
