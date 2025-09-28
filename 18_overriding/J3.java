class S4 {
    protected void pro() {

    }
}

class J3 extends S4 {
    void pro() {
        
    }
}


// J3.java:8: error: pro() in J3 cannot override pro() in S4
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was protected
// 1 error