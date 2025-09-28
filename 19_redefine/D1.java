class W1 {
    void info() {
        System.out.println("dholu");
    }
}

class T1 extends W1 {
    void info() {
        System.out.println("bholu");
    }
}

class D1 {
    public static void main(String[] args) {
        T1 x = new T1();

        x.info();
    }
}