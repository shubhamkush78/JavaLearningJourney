package x.y;

import a.b.c.A;

class D {
    public static void main(String[] args) {
        A x = new A();

        x.pro();
    }    
}


// x\y\D.java:9: error: pro() is not public in A; cannot be accessed from outside package
//         x.pro();
//          ^
// 1 error