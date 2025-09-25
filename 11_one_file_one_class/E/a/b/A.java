package a.b;

import x.y.B;

class A {
    public static void main(String[] args) {
        B x = new B();
    }
}





// a\b\A.java:3: error: cannot find symbol
// import x.y.B;
//           ^
//   symbol:   class B
//   location: package x.y
// a\b\A.java:7: error: cannot find symbol
//         B x = new B();
//         ^
//   symbol:   class B
//   location: class A
// a\b\A.java:7: error: cannot find symbol
//         B x = new B();
//                   ^
//   symbol:   class B
//   location: class A
// 3 errors