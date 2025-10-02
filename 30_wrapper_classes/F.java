class F {
    public static void main(String[] args) {
        byte x = 67;
        // int y = x;
                
        Integer y = x;
        
        System.out.println(y);
    }    
}


// F.java:6: error: incompatible types: byte cannot be converted to Integer
//         Integer y = x;
//                     ^
// 1 error