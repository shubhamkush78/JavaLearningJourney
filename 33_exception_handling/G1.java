class G1 {
    public static void main(String[] args) {
        System.out.println(1);
        
        ArithmeticException x = new ArithmeticException();
        
        if(12<13)
            throw x;
        
        System.out.println(2);
    }    
}