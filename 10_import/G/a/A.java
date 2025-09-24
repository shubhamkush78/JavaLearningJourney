package a;

import x.B;
import m.B;

class A {
    public static void main(String[] args) {
        B b;

        B h;
    }
}



// a\A.java:4: error: a type with the same simple name is already defined by the single-type-import of B
// import m.B;
// ^
// a\A.java:8: error: reference to B is ambiguous
//         B b;
//         ^
//   both class x.B in x and class m.B in m match
// a\A.java:10: error: reference to B is ambiguous
//         B h;
//         ^
//   both class x.B in x and class m.B in m match
// 3 errors