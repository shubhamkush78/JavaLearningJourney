class D1 {
    static void pro() {

    }
}

class D2 extends D1 {
    void pro() {

    }
}


// N1.java:8: error: pro() in D2 cannot override pro() in D1
//     void pro() {
//          ^
//   overridden method is static
// 1 error