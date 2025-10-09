class T2 {
    int k = 200;
    class X extends AAAA {
        int k = 20;
        void pro() {
            int k = 2;
            System.out.println(k);
            System.out.println(this.k);
            System.out.println(super.k);
            System.out.println(T2.this.k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new T2().new X();

        x.pro();
    }
}

class AAAA {
    int k = 9999;
}