class S {
    static {
        System.out.println("A");
        int y = 12/0;
        System.out.println("Y");
    }   
    
    public static void main(String[] args) {
        System.out.println("H");
        System.out.println("J");
    }
}



// A
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at S.<clinit>(S.java:4)