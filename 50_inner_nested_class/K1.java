class K1 {
    static int w = 3;

    static class A {
        void pro() {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        A k = new A();
        k.pro();
    }    
}