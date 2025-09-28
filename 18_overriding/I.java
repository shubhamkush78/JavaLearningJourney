class Z2 {
    void pro() {

    }
}

class I extends Z2 {
    private void pro() {

    }
}



// I.java:8: error: pro() in I cannot override pro() in Z2
//     private void pro() {
//                  ^
//   attempting to assign weaker access privileges; was package
// 1 error