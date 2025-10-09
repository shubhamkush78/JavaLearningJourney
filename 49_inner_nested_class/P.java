class P {
    private void info() {
        System.out.println("Wadakkam");
    }

    class X {
        private void pro() {
            info();
        }
    }   
    
    public static void main(String[] args) {
        P n = new P();

        X x = n.new X();

        x.pro();
    }
}
