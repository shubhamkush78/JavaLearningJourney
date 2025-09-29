class Y1 {
    int y = 90;
    float z;

    void pro() {
        System.out.println("pro()");
    }
}

class Y2 extends Y1 {
    boolean x;
    char t = 'A';

    void info() {
        System.out.println("info()");
    }
}

class H {
    public static void main(String[] args) {
        Y2 a = new Y2();

        System.out.println(a.y);
        System.out.println(a.z);
        System.out.println(a.x);
        System.out.println(a.t);

        a.pro();
        a.info();

        System.out.println(a.toString());
        System.out.println(a.hashCode());
    }
}
