class O1 {
    private void info() {
        System.out.println("Kemcho");
    }

    class X {
        void pro() {
            info();
        }
    }   
    
    public static void main(String[] args) {
        O1 n = new O1();

        X x = n.new X();

        x.pro();
    }
}
