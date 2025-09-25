class L1 {
    final int w = 8;

    public static void main(String[] args) {
        L1 x = new L1();

        System.out.println(x.w);
        x.w = 49;
        System.out.println(x.w);
    }    
}


// L1.java:8: error: cannot assign a value to final variable w
//         x.w = 49;
//          ^
// 1 error