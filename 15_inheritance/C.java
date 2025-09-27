class Y {
    int x = 22;

    void pro() {
        System.out.println("pro() in Y");
    }
}

class C extends Y {
    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.x);
        c.pro();

        c.hashCode();
        c.toString();
    }
}
