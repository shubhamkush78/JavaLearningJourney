class G {
    public static void main(String[] args) {
        System.out.println(1);
        
        ArithmeticException x = new ArithmeticException();
        
        throw x;
        
        System.out.println(2);
    }    
}


// G.java:9: error: unreachable statement
//         System.out.println(2);
//         ^
// 1 error
