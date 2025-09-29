class Y1 {
    int y = 90;
    float z;

    void pro() {
        System.out.println("pro() ~");
    }
}

class Y2 extends Y1 {
    boolean x;
    char t = 'A';

    void info() {
        System.out.println("info() ~");
    }

    Y2() {
        info();
        System.out.println(x);
        System.out.println(t);
        System.out.println(y);
        System.out.println(z);
        pro();
    }
}

class H1 {
    public static void main(String[] args) {
        Y2 a = new Y2();
    }
}
