@FunctionalInterface
interface EE {
    int add(int a, int b);
}

class X5 implements EE {
    public int add(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }
}

class S {
    public static void main(String[] args) {
        EE a = new X5();

        System.out.println(a.add(12, 13));
    }
}
