package x.y;



class C extends B {
    public static void main(String[] args) {
        B x = new B();

        x.pro();
    }
}


// x\y\C.java:9: error: pro() has protected access in A
//         x.pro();
//          ^
// 1 error