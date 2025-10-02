class J1 {
    public static void main(String[] args) {
        Integer x = new Integer("340w0");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "340w0"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.<init>(Integer.java:1127)
//         at J1.main(J1.java:3)

