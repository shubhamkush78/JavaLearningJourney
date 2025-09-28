class X4 {
    void pro() {
        System.out.println("Namaste");
    }
}

class D extends X4 {
    public static void main(String[] args) {
        D d = new D();

        d.pro();
        d.pro(12);
    }    

    // class D has 2 overloaded method versions of method pro
    void pro(int x) {
        System.out.println("Hello");
    }
}
