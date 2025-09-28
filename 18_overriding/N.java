class C1 {
    void pro() {

    }
}

class C2 extends C1 {
    static void pro() {

    }
}


// N.java:8: error: pro() in C2 cannot override pro() in C1
//     static void pro() {
//                 ^
//   overriding method is static
// 1 error