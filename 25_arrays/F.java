class F {
    public static void main(String[] args) {
        int[] x;

        x = {10, 20, 40, 50, 60, 70};
        
        System.out.println(x.length);
    }    
}



// F.java:5: error: illegal start of expression
//         x = {10, 20, 40, 50, 60, 70};
//             ^
// F.java:5: error: not a statement
//         x = {10, 20, 40, 50, 60, 70};
//              ^
// F.java:5: error: ';' expected
//         x = {10, 20, 40, 50, 60, 70};
//                ^
// 3 errors
