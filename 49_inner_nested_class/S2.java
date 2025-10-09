class S2 {
    class X {
        int k = 10;
        void pro() {
            int k = 1;
            System.out.println(k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new S2().new X();

        x.pro();
    }
}