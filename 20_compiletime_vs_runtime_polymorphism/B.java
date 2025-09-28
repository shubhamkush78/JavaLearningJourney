class B {
    static void pro(int x) {
        System.out.println("pro(int)");
    } 
    
    static void pro(float x) {
        System.out.println("pro(float)");
    } 
    public static void main(String[] args) {
        pro(2.3);
    }
}



// B.java:10: error: no suitable method found for pro(double)
//         pro(2.3);
//         ^
//     method B.pro(int) is not applicable
//       (argument mismatch; possible lossy conversion from double to int)
//     method B.pro(float) is not applicable
//       (argument mismatch; possible lossy conversion from double to float)
// 1 error