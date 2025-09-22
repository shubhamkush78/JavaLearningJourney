package x.y;

import a.b.c.A;

class E extends A {
    public static void main(String[] args) {
        E x = new E();
        x.pro();
    }    
}



// x\y\E.java:8: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type E
// 1 error



