package a.b.c;

class C extends A {
    public static void main(String[] args) {
        C x = new C();
        x.pro();
    }    
}


// a\b\c\C.java:6: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type C
// 1 error
