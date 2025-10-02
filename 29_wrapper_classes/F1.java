class F1 {
    public static void main(String[] args) {
        Byte x = new Byte("128");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at java.base/java.lang.Byte.<init>(Byte.java:372)
//         at F1.main(F1.java:3)

