class S1 {

    static char s = 'H';

    static void pro() {
        class A {
            void info() {
                System.out.println(s);
            }
        }

        A x = new A();
        x.info();
    }

    public static void main(String[] args) {
        S1.pro();
    }    
}
