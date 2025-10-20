class X4 {
    void process(int a, String b, float c) {
        System.out.println("Hi Ji");
    }
}

class D extends X4 {
    @Override
    void process(int a, float b, String c) {
        System.out.println("Namaskaram");
    }
    
    public static void main(String[] args) {
        D x = new D();

        x.process(21, "om", 4.5f);
    }
}


// D.java:8: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error
