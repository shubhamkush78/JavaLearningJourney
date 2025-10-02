class M1 {
    public static void main(String[] args) {
        Float f1 = new Float("2.3a");

        System.out.println(f1);
    }
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "2.3a"
//         at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
//         at java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
//         at java.base/java.lang.Float.parseFloat(Float.java:476)
//         at java.base/java.lang.Float.<init>(Float.java:575)
//         at M1.main(M1.java:3)
