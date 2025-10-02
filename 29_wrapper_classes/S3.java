class S3 {
    public static void main(String[] args) {
        // Short x = Short.valueOf("101", 2);
        // Short x = Short.valueOf("19", 16);

        Short x = Short.valueOf("18", 8);
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "18" under radix 8

        System.out.println(x);
    }
}

