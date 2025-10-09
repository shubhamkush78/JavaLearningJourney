class Q {

    void pro() {
        class A {
            void info() {
                System.out.println("Hello");
            }
        }

        A y = new A();
        y.info();
    }   
    
    public static void main(String[] args) {
        Q x = new Q();
        
        x.pro();
    }
}
