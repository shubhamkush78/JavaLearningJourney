// one of the method if declared static again can't decide method overloading...
// only parameter body must mismatch to create legal method overloading...

class I {
    void pro() {

    }

    static void pro() {

    }
}


// I.java:6: error: method pro() is already defined in class I
//     static void pro() {
//                 ^
// 1 error