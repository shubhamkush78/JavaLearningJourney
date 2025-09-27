// return type doesn't count when considering method overloading... 
// there is only one rule and that is the parameters must mismatch.

class F {
    int pro() {
        return 0;
    }    

    void pro() {

    }
}


// F.java:6: error: method pro() is already defined in class F
//     void pro() {
//          ^
// 1 error