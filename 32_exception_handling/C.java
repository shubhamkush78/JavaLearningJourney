class C {
    public static void main(String[] args) {
        System.out.println(1);

        int[] x = {12, 23, 45};
        System.out.println(x[3]);

        System.out.println(2);
    }    
}


// 1
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at C.main(C.java:6)