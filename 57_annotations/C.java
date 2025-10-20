class X3 {
    void process() {
        System.out.println("Hello Ji");
    }
}

class C extends X3 {
    @Override
    void prcess() {
        System.out.println("Namaste Ji");
    }
    
    public static void main(String[] args) {
        C x = new C();
        
        x.process();
    }
}


// C.java:8: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error