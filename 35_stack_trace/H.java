class I {
    I() {
        System.out.println(1);
        J.pro();
    }
}

class J {
    static void pro() {
        
        System.out.println(3);

        int y = 12/0;

        System.out.println(4);
    }
}

class H {        
    static {
        System.out.println(2);
        I x = new I();
    }

    public static void main(String[] args) {
        System.out.println(-1);
    }    
}



// 2
// 1
// 3
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at J.pro(H.java:13)
//         at I.<init>(H.java:4)
//         at H.<clinit>(H.java:22)