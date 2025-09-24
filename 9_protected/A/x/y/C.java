package x.y;

class C {
    public static void main(String[] args) {
        B x = new B();

        x.pro();
    }    
}


// x\y\C.java:7: error: pro() has protected access in A
//         x.pro();
//          ^
// 1 error