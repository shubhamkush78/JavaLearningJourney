class M {
    public static void main(String[] args) {
        int[][][] x = new int[2][3][5];

        // System.out.println(x instanceof Object);
        // System.out.println(x[0] instanceof Object);
        // System.out.println(x[0][0] instanceof Object);

        // System.out.println(x[0][0][0] instanceof Object);
        // M.java:8: error: unexpected type
        // System.out.println(x[0][0][0] instanceof Object);
        //                           ^
        // required: reference
        // found:    int
        // 1 error
    }    
}
