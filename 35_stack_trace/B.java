class M {
    static void aaa() {
        N.bbb();
    }
}

class N {
    static void bbb() {
        O.ccc();
    }
}

class O {
    static void ccc() {
        P.ddd();
    }
}

class P {
    static void ddd() {
        System.out.println(1);

        int y = 12/0;
        
        System.out.println(2);
    }
}

class B {
    public static void main(String[] args) {
        M.aaa();
    }
}


// 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at P.ddd(B.java:23)
//         at O.ccc(B.java:15)
//         at N.bbb(B.java:9)
//         at M.aaa(B.java:3)
//         at B.main(B.java:31)