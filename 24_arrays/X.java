class X {
    static int[] x = new int[0];
    public static void main(String[] args) {
        System.out.println(x[0]);
    }    
}


// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at X.main(X.java:4)
