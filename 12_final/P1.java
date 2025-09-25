class P1 {
    static int x;
    static final int y;

    P1() {
        y = 999;
    }

    public static void main(String[] args) {
        System.out.println(y);
    }    
}


// P1.java:6: error: cannot assign a value to final variable y
//         y = 999;
//         ^
// 1 error