package x;

import y.B;

class A {
    public static void main(String[] args) {
        B x = new B();
    }
}




// x\A.java:7: error: B() is not public in B; cannot be accessed from outside package
//         B x = new B();
//               ^
// 1 error
