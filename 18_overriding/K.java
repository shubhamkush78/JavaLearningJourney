class T1 {
    public void pro() {

    }
}

class K extends T1 {
    private void pro() {

    }
}


// K.java:8: error: pro() in K cannot override pro() in T1
//     private void pro() {
//                  ^
//   attempting to assign weaker access privileges; was public
// 1 error