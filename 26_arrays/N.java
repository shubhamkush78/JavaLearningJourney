class N {
    public static void main(String[] args) {
        int[][][] x = new int[2][3][5];

        System.out.println(x instanceof int[][][]);
        // System.out.println(x instanceof int[][]); // error: incompatible types: int[][][] cannot be converted to int[][]
        // System.out.println(x instanceof int[]);  // error: incompatible types: int[][][] cannot be converted to int[]
        
        // System.out.println(x[0] instanceof int[][][]);  // error: incompatible types: int[][] cannot be converted to int[][][]
        // System.out.println(x[0] instanceof int[]);  //error: incompatible types: int[][] cannot be converted to int[]
        // System.out.println(x[0] instanceof int[][]);  
        
        // System.out.println(x[0][0] instanceof int[][][]);  // error: incompatible types: int[] cannot be converted to int[][][]
        // System.out.println(x[0][0] instanceof int[][]);  // error: incompatible types: int[] cannot be converted to int[][]
        System.out.println(x[0][0] instanceof int[]);  
    }
}