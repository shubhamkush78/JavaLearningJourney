package a.b;

import c.d.B;

class A {
    public static void main(String[] args) {
        B.aaa();
    }
}


// 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at i.j.E.ddd(E.java:7)
//         at g.h.D.ccc(D.java:7)
//         at e.f.C.bbb(C.java:7)
//         at c.d.B.aaa(B.java:7)
//         at a.b.A.main(A.java:5)