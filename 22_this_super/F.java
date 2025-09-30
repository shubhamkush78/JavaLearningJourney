class WW {
    void pro() {
        System.out.println("Hello");
    }
}

class F extends WW {
    void pro() {
        System.out.println("Hi");
    }
    
    public static void main(String[] args) {
        F f = new F();

        f.info();
    }

    void info() {
        pro();
        this.pro();
        super.pro();
    }
}
