package x.y;

import a.b.c.A;

class D {
    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }    
}


// x\y\D.java:8: error: pro() has private access in A
//         x.pro();
//          ^
// 1 error