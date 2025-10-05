class F {
    {
        System.out.println(1);
    }
    
    {
        System.out.println(2);

    }

    {
        System.out.println(3);

        int y = 12/0;

        System.out.println(4);
    }

    F() {
        System.out.println(0);
    }

    public static void main(String[] args) {
        System.out.println(-1);
        F a = new F();
        System.out.println(100);
    }    
}


// -1
// 1
// 2
// 3
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at F.<init>(F.java:14)
//         at F.main(F.java:25)