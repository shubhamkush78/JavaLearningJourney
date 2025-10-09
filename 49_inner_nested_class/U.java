class U {
    int k = 300;
    class X extends AAAAA {
        int k = 30;
        void pro() {
            // int k = 3;
            System.out.println(k);
            System.out.println(this.k);
            System.out.println(super.k);
            System.out.println(U.this.k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new U().new X();

        x.pro();
    }
}

class AAAAA {
    int k = 5555;
}