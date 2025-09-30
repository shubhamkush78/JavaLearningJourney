class W1 {
    static int[] x;
    public static void main(String[] args) {
        System.out.println(x.length);
    }    
}


// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "W1.x" is null
//         at W1.main(W1.java:4)