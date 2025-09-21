class H {
    float e = 2.3f;

    public static void main(String[] args) {
        H h = new H();
        h.pro();

    }

    void pro() {
        System.out.println(H.e);
    }
}

// H.java:12: error: non-static variable
//  e cannot be referenced from a static context
//         System.out.println(H.e);
//                             ^
// 1 error