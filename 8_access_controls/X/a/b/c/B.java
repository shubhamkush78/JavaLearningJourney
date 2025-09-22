package a.b.c;

class B {
    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }    
}


// a\b\c\B.java:6: error: pro() has private access in A
//         x.pro();
//          ^
// 1 error