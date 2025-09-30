class P1 {
    public static void main(String[] args) {
        long a = 1;
        float b = 3.4f;
        double c = 4.56;
        
        int[] x = new int[3];

        x[0] = a;
        x[1] = b;
        x[2] = c;

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }    
}


// P1.java:9: error: incompatible types: possible lossy conversion from long to int
//         x[0] = a;
//                ^
// P1.java:10: error: incompatible types: possible lossy conversion from float to int
//         x[1] = b;
//                ^
// P1.java:11: error: incompatible types: possible lossy conversion from double to int
//         x[2] = c;
//                ^
// 3 errors