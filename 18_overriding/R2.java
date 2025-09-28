class N3 {
    static public void pro() {

    }
}

class R2 extends N3 {
    static /*public*/ void pro() {
        
    }
}


// R2.java:8: error: pro() in R2 cannot override pro() in N3
//     static /*public*/ void pro() {
//                            ^
//   attempting to assign weaker access privileges; was public
// 1 error