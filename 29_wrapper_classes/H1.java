class H1 {
    public static void main(String[] args) {
        Short x = new Short("32768");

        System.out.println(x);
    }    
}

// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"32768" Radix:10
//         at java.base/java.lang.Short.parseShort(Short.java:139)
//         at java.base/java.lang.Short.<init>(Short.java:377)
//         at H1.main(H1.java:3)
