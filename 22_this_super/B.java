class X1 {

}

class B extends X1 {
    int t = 11;
    public static void main(String[] args) {
        B a = new B();
        a.pro();
    }

    void pro() {
        int t = 1;
        System.out.println(t);
        System.out.println(this.t);
    }
}