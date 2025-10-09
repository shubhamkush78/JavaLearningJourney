class S1 {
    class X {
        void pro() {
            int k = 2;
            System.out.println(k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new S1().new X();

        x.pro();
    }
}