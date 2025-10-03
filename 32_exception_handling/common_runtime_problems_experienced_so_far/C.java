class C {
    public static void main(String[] args) {
        int[] x = new int[-2];

        System.out.println(x);
    }
}


// Exception in thread "main" java.lang.NegativeArraySizeException: -2
//         at C.main(C.java:3)