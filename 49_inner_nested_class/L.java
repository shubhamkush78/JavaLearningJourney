class L {
    class X {
        private void pro() {
            System.out.println("Hiiiiii....iiii ....");
        }
    }

    public static void main(String[] args) {
        L j = new L();

        X x = j.new X();
        x.pro();
    }
}