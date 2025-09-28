interface O4 {
    void pro();
}

class S1 implements O4 {
    void pro() {

    }
}



// S1.java:6: error: pro() in S1 cannot implement pro() in O4
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error