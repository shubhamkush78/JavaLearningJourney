class O1 {
    public static void main(String[] args) {
        long a = 1;
        float b = 3.4f;
        double c = 4.56;
        
        int d = a;
        int e = b;
        int f = c;
    }    
}


// O1.java:7: error: incompatible types: possible lossy conversion from long to int
//         int d = a;
//                 ^
// O1.java:8: error: incompatible types: possible lossy conversion from float to int
//         int e = b;
//                 ^
// O1.java:9: error: incompatible types: possible lossy conversion from double to int
//         int f = c;
//                 ^
// 3 errors