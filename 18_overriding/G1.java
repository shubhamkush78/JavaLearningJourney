class X6 {
    int info() {
        return 0;
    }
}

class G1 extends X6 {
    byte info() {
        return 12;
    }
}

// overridden method declared int as a return type then the 
// overriding method must declare the same(int) return type 



// G1.java:8: error: info() in G1 cannot override info() in X6
//     byte info() {
//          ^
//   return type byte is not compatible with int
// 1 error
