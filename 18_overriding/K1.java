class T2 {
    public void pro() {

    }
}

class K1 extends T2 {
    void pro() {

    }
}

// K1.java:8: error: pro() in K1 cannot override pro() in T2
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error