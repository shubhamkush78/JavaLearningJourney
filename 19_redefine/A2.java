class Z {
    int a = 9;
}

class Z1 extends Z {
    int a = 99;
}

class A2 {
    public static void main(String[] args) {
        Z t = new Z1();

        System.out.println(t.a);
    }
}