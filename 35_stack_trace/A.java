class A {

    static void aaa() {
        bbb();
    }
    
    static void bbb() {
        ccc();
    }
    
    static void ccc() {
        ddd();
    }
    
    static void ddd() {
        System.out.println(1);

        int y = 12/0;
        
        System.out.println(2);
    }


    public static void main(String[] args) {
        aaa();
    }
}


// 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.ddd(A.java:18)
//         at A.ccc(A.java:12)
//         at A.bbb(A.java:8)
//         at A.aaa(A.java:4)
//         at A.main(A.java:25)