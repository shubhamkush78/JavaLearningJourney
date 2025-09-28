class M1 {
    void info() {
        System.out.println("Hello");
    }
}

class M2 extends M1 {    
    void info() {
        System.out.println("Hi");
    }
}

class O {
    public static void main(String[] args) {
        M1 x = new M1();

        x.info();
    }
}
