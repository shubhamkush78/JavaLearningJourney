class L {
    private static int q = 97;

    static class A {
        void pro() {
            System.out.println(q);
        }
    }   
    
    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }
}
