class VV {
    static void pro() {
        System.out.println("Hello");
    }
}

class G extends VV {
    static void pro() {
        System.out.println("Hi");
    }
    
    public static void main(String[] args) {
        G f = new G();

        f.info();
    }

    void info() {
        pro();
        this.pro();
        super.pro();
    }
}
