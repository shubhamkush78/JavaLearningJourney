class A {
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = a;
        System.out.println(a + " - " + b);

        a++;

        System.out.println(a + " - " + b);
    }
}