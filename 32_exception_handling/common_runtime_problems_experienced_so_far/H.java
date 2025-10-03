class H {
    static {
        String x = null;
        System.out.println(x.length());
    }


    public static void main(String[] args) {
        
    }    
}


// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "<local0>" is null
//         at H.<clinit>(H.java:4)
