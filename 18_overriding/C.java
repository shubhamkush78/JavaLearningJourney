class X3 {
    void pro() {
        System.out.println("Hi");
    }
}

class C extends X3 {
    public static void main(String[] args) {
        C x = new C();
        x.pro();
        x.pro();
    }

    // method overriding (redefining the inherited method...)    
    void pro() {
        System.out.println("Hello");
    }
}
