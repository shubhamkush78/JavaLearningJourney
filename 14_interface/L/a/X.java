package a;

import b.Y;

class X {
    public static void main(String[] args) {
        Y x;
    }
}



// a\X.java:3: error: Y is not public in b; cannot be accessed from outside package
// import b.Y;
//         ^
// a\X.java:7: error: Y is not public in b; cannot be accessed from outside package
//         Y x;
//         ^
// 2 errors