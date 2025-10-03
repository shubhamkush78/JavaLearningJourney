class E {
    public static void main(String[] args) {
        Integer.parseInt("2a4");
    }    
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "2a4"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.parseInt(Integer.java:786)
//         at E.main(E.java:3)
