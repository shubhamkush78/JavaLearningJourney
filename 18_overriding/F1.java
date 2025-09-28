class Z1 {
    void pro() {

    }
}

class F1 extends Z1 {
    int pro() {
       return 1; 
    }
}

// overridden method declared void as a return type then the overriding method must declare the same(void) return type 




// F1.java:8: error: pro() in F1 cannot override pro() in Z1
//     int pro() {
//         ^
//   return type int is not compatible with void
// 1 error