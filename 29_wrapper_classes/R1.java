class R1 {
    public static void main(String[] args) {
        // Byte x = Byte.valueOf("300");
        // Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"300" Radix:10
        
        Byte x = Byte.valueOf("127");

        System.out.println(x);
    }    
}
