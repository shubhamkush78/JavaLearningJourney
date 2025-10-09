class K {
    int w = 3;

    static class A {
        void pro() {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        A k = new A();
        k.pro();
    }    
}



// K.java:6: error: non-static variable w cannot be referenced from a static context
//             System.out.println(w);
//                                ^
// 1 error