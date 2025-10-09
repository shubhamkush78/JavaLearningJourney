class U1 {
    int k = 300;
    class X extends BB {
        // int k = 30;
        void pro() {
            // int k = 3;
            System.out.println(k);
            System.out.println(this.k);
            System.out.println(super.k);
            System.out.println(U1.this.k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new U1().new X();

        x.pro();
    }
}

class BB {
    int k = 5555;
}