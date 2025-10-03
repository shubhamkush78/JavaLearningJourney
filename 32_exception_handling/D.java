class D {
    public static void main(String[] args) {
        System.out.println(1);

        int tmp = Integer.parseInt("1a3");

        System.out.println(2);
    }    
}


// 1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "1a3"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.parseInt(Integer.java:786)
//         at D.main(D.java:5)