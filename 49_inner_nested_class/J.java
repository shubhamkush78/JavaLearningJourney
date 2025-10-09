class J {
    class X {
        void pro() {
            System.out.println("Hi");
        }
    }

    public static void main(String[] args) {
        J j = new J();

        X x = j.new X();
        x.pro();
    }
}