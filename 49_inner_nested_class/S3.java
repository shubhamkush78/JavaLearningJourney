class S3 {
    class X {
        int k = 10;
        void pro() {
            int k = 1;
            System.out.println(k);
            System.out.println(this.k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new S3().new X();

        x.pro();
    }
}