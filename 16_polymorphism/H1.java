abstract class Y1 {

}

class Y2 extends Y1 {

}

class H1 {
    public static void main(String[] args) {
        Y1 a = new Y1();
    }
}


// H1.java:11: error: Y1 is abstract; cannot be instantiated
//         Y1 a = new Y1();
//                ^
// 1 error
