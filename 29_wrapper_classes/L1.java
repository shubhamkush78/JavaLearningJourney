class L1 {
    public static void main(String[] args) {
        Long x = new Long("343432342234232342L");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "343432342234232342L"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Long.parseLong(Long.java:711)
//         at java.base/java.lang.Long.<init>(Long.java:1348)
//         at L1.main(L1.java:3)