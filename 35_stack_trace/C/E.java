class E {
    static void ddd() {
        System.out.println(1);

        int y = 12/0;
        
        System.out.println(2);
    }
}


// 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at E.ddd(E.java:5)
//         at D.ccc(D.java:3)
//         at C.bbb(C.java:3)
//         at B.aaa(B.java:3)
//         at A.main(A.java:3)