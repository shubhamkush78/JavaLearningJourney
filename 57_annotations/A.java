class X1 {
    void process() {
        System.out.println("Hello Ji");
    }
}

class A extends X1 {
    void prcess() {
        System.out.println("Namaste Ji");
    }
    
    public static void main(String[] args) {
        A x = new A();
        x.process();
    }
}