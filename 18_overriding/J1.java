class S2 {
    protected void pro() {

    }
}

class J1 extends S2 {
    private void pro() {
        
    }
}



// J1.java:8: error: pro() in J1 cannot override pro() in S2
//     private void pro() {
//                  ^
//   attempting to assign weaker access privileges; was protected
// 1 error