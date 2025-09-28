class T3 {
    public void pro() {

    }
}

class K2 extends T3 {
    protected void pro() {

    }
}



// K2.java:8: error: pro() in K2 cannot override pro() in T3
//     protected void pro() {
//                    ^
//   attempting to assign weaker access privileges; was public
// 1 error