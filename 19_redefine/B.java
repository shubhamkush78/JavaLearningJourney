class X2 {
    static int a = 2;
}

class X3 extends X2 {
    static int a = 22;
}

class B {
    public static void main(String[] args) {
        X2 t = new X2();

        System.out.println(t.a);
    }
}