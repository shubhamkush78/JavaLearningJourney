class X2 {
    int t = 111;
}

class C extends X2 {
    int t = 11;
    public static void main(String[] args) {
        C a = new C();
        a.pro();
    }

    void pro() {
        int t = 1;
        System.out.println(t);
        System.out.println(this.t);
        System.out.println(super.t);
    }
}