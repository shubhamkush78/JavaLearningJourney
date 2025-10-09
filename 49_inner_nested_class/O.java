class O {
    private float w = 18.23f;

    class X {
        void pro() {
            System.out.println(w);
        }
    }   
    
    public static void main(String[] args) {
        O n = new O();

        X x = n.new X();

        x.pro();
    }
}
