interface II {
    void pro();
}

class S2 implements II {
    void pro() {

    }
}



// S2.java:6: error: pro() in S2 cannot implement pro() in II
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error