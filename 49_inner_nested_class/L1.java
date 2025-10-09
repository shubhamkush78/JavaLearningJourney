class L1 {
    class X {
        private int t = 1111;
    }

    public static void main(String[] args) {
        L1 j = new L1();

        X x = j.new X();
        System.out.println(x.t);
    }
}