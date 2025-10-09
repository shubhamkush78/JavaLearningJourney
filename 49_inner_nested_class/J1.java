class J1 {
    class X {
        int t = 999;
    }

    public static void main(String[] args) {
        J1 j = new J1();

        X x = j.new X();
        System.out.println(x.t);
    }
}