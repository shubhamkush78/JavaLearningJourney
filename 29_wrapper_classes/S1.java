class S1 {
    public static void main(String[] args) {
        // Short x = Short.valueOf("42000");
        Short x = Short.valueOf("32767");

        System.out.println(x);
    }
}


// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"42000" Radix:10