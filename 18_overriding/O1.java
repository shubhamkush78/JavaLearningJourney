class M3 {
    void info() {
        System.out.println("Hello");
    }
}

class M4 extends M3 {    
    void info() {
        System.out.println("Hi");
    }
}

class O1 {
    public static void main(String[] args) {
        M4 x = new M4();

        x.info();
    }
}
