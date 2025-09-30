class ZZ {
    static int t = 999;
}

class E extends ZZ {
    static int t = 99;

    public static void main(String[] args) {
        E e = new E();

        e.pro();
    }

    void pro() {
        int t = 9;

        System.out.println(t);
        System.out.println(this.t);
        System.out.println(super.t);
    }
}

