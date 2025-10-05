class G {
    static {
        System.out.println(1);
    }
    
    static {
        System.out.println(2);

    }

    static {
        System.out.println(3);

        int y = 12/0;

        System.out.println(4);
    }

    public static void main(String[] args) {
        System.out.println(-1);
    }    
}



// 1
// 2
// 3
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at G.<clinit>(G.java:14)