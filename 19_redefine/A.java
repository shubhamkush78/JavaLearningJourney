class X {
    int a = 9;
}

class X1 extends X {
    int a = 99;
}

class A {
    public static void main(String[] args) {
        X t = new X();

        System.out.println(t.a);
    }
}