class X2 {
    void process(int a, String b, float c) {
        System.out.println("Hi Ji");
    }
}

class B extends X2 {
    void process(int a, float b, String c) {
        System.out.println("Namaskaram");
    }
    
    public static void main(String[] args) {
        B x = new B();

        x.process(21, "om", 4.5f);
    }
}
