class X extends Thread {
    public void run() {
        System.out.println("X.run()");
        aaa();
    }

    void aaa() {
        System.out.println(1);
        int y = 12/0;
        System.out.println(2);
    }
}

class Y extends Thread {
    public void run() {
        System.out.println("Y.run()");
        bbb();
    }

    void bbb() {
        System.out.println(1);
        int y = 12/0;
        System.out.println(2);
    }
}

class I {
    public static void main(String[] args) {
        X a = new X();
        a.setName("Golu");
        a.start();
        Y b = new Y();
        b.setName("Bablu");
        b.start();

        ccc();
    }  
    
    static void ccc() {
        System.out.println(1);
        int y = 12/0;
        System.out.println(2);
    }
}


// X.run()
// 1
// 1
// Exception in thread "main" Y.run()
// Exception in thread "Golu" 1
// java.lang.ArithmeticException: / by zero
//         at I.ccc(I.java:41)
//         at I.main(I.java:36)
// Exception in thread "Bablu" java.lang.ArithmeticException: / by zero
//         at X.aaa(I.java:9)
//         at X.run(I.java:4)
// java.lang.ArithmeticException: / by zero
//         at Y.bbb(I.java:22)
//         at Y.run(I.java:17)
