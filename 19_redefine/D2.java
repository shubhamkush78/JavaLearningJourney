class W2 {
    void info() {
        System.out.println("raju");
    }
}

class T2 extends W2 {
    void info() {
        System.out.println("chutki");
    }
}

class D2 {
    public static void main(String[] args) {
        W2 x = new T2();

        x.info();  // Dynamic Method Dispatch (Runtime Polymorphism)
    }
}