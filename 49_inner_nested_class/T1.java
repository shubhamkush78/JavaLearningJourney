class T1 {
    int k = 200;
    class X extends AAA {
        int k = 20;
        void pro() {
            int k = 2;
            System.out.println(k);
            System.out.println(this.k);
            System.out.println(super.k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new T1().new X();

        x.pro();
    }
}

class AAA {
    int k = 9999;
}