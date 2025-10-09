class R {
    boolean flag = true;

    void pro() {
        class A {
            void info() {
                System.out.println(flag);
            }
        }

        A x = new A();
        x.info();
    }    

    public static void main(String[] args) {
        R r = new R();

        r.pro();
    }
}
