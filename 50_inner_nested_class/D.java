class D {
    private int y = 88;

    class E extends D {
        void pro() {
            System.out.println(y);
            System.out.println(this.y);
            System.out.println(super.y);
            System.out.println(D.this.y);
        }
    }
}


// D.java:7: error: y has private access in D
//             System.out.println(this.y);
//                                    ^
// 1 error