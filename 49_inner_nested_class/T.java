class T {
    int k = 200;
    class X {
        int k = 20;
        void pro() {
            int k = 2;
            System.out.println(k);
            System.out.println(this.k);
            System.out.println(super.k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new T().new X();

        x.pro();
    }
}


// T.java:9: error: cannot find symbol
//             System.out.println(super.k);
//                                     ^
//   symbol: variable k
// 1 error