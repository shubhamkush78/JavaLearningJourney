class N2 {
    static void pro() {

    }
}

class R1 extends N2 {
    static int pro() {
        return 0;
    }
}



// R1.java:8: error: pro() in R1 cannot hide pro() in N2
//     static int pro() {
//                ^
//   return type int is not compatible with void
// 1 error