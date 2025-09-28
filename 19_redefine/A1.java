class Y {
    int a = 9;
}

class Y1 extends Y {
    int a = 99;
}

class A1 {
    public static void main(String[] args) {
        Y1 t = new Y1();

        System.out.println(t.a);
    }
}