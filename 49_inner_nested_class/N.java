class N {
    float w = 8.9f;

    class X {
        void pro() {
            System.out.println(w);
        }
    }   
    
    public static void main(String[] args) {
        N n = new N();

        X x = n.new X();

        x.pro();
    }
}
