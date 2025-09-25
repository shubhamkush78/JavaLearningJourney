package a;

import b.Y;

class X {
    public static void main(String[] args) {
        System.out.println(Y.golu);
    }
}



// a\X.java:7: error: golu is not public in Y; cannot be accessed from outside package
//         System.out.println(Y.golu);
//                             ^
// 1 error