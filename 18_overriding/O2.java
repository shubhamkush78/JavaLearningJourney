class M5 {
    void info() {
        System.out.println("Hello");
    }
}

class M6 extends M5 {    
    void info() {
        System.out.println("Hi");
    }
}

class O2 {
    public static void main(String[] args) {
        M5 x = new M6();

        x.info();
    }
}
