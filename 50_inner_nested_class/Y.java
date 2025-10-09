class KK {
    void pro() {
        System.out.println("Hi");
    }
}

class LL extends KK {
    void pro() {
        System.out.println("Hello");
    }

    void info() {
        System.out.println("Kemcho");
    }
}

class Y {
    public static void main(String[] args) {
        KK a = new LL();

        a.pro();
        // a.info();

        LL x = (LL)a;
        x.info();
    }
}


// Y.java:22: error: cannot find symbol
//         a.info();
//          ^
//   symbol:   method info()
//   location: variable a of type KK
// 1 error
