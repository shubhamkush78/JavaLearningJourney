class B {
    public static void main(String[] args) {
        int[] x = null;

        System.out.println(x[0]);
    }
}


// Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local1>" is null
//         at B.main(B.java:5)