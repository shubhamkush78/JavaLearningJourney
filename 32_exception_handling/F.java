class F {
    public static void main(String[] args) {
        System.out.println(1);

        String s = null;
        
        try {
            System.out.println(s.length()); // NullPointerException...
        } catch(ArithmeticException e) {
            //--- your solution code...
            System.out.println("Hello");
        }

        System.out.println(2);
    }    
}


// 1
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
//         at F.main(F.java:8)