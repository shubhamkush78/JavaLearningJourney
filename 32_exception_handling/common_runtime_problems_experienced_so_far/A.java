class A {
    public static void main(String[] args) {
        int[] x = null;

        System.out.println(x.length);
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local1>" is null
//         at A.main(A.java:5)
