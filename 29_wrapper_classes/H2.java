class H2 {
    public static void main(String[] args) {
        Short x = new Short("aa2");

        System.out.println(x);
    }    
}



// Exception in thread "main" java.lang.NumberFormatException: For input string: "aa2"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Short.parseShort(Short.java:137)
//         at java.base/java.lang.Short.<init>(Short.java:377)
//         at H2.main(H2.java:3)