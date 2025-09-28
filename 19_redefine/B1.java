class Y2 {
    static int a = 7;
}

class Y3 extends Y2 {
    static int a = 77;
}

class B1 {
    public static void main(String[] args) {
        Y3 t = new Y3();

        System.out.println(t.a);
    }
}