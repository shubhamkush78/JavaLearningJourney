/*final*/ class T1 {
    void pro() {
        System.out.println("pro() in T1");
    }

    void info() {
        System.out.println("info() in T1");
    }

    void process() {
        System.out.println("process() in T1");
    }
}

class H1 extends T1 {
    void pro() {
        System.out.println("pro() in H1");
    }

    void info() {
        System.out.println("info() in H1");
    }

    void process() {
        System.out.println("process() in H1");
    }

    public static void main(String[] args) {
        
    }
}
