class F1 {
    public static void main(String[] args) {
        short x = 234;
        // int y = x;
                
        Integer y = x;
        
        System.out.println(y);
    }    
}

// F1.java:6: error: incompatible types: short cannot be converted to Integer
//         Integer y = x;
//                     ^
// 1 error