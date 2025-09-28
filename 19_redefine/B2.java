class Z2 {
    static int a = 5;
}

class Z3 extends Z2 {
    static int a = 555;
}

class B2 {
    public static void main(String[] args) {
        Z2 t = new Z3();

        System.out.println(t.a);
    }
}