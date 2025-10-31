@FunctionalInterface
interface BB {
    void pro(int a);
}

class X2 implements BB {
    public void pro(int a) {
        System.out.println(a);
    }
}

class M {
    public static void main(String[] args) {
        BB x = new X2();

        x.pro(555);
    }    
}
