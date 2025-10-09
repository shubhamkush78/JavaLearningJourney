class T {
    private double e = 3.14;

    void pro() {
        class A {
            private void info() {
                System.out.println(e);
            }
        }

        A x = new A();
        x.info();
    }    

    public static void main(String[] args) {
        T t = new T();

        t.pro();
    }
}
