@FunctionalInterface
interface CC {
    void pro(int a, int b);
}

class X3 implements CC {
    public void pro(int a, int b) {
        System.out.println(a + " - " + b);
    }
}

class O {
    public static void main(String[] args) {
        CC x = new X3();

        x.pro(12, 13);
    }    
}
