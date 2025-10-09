class S {
    class X {
        void pro() {
            System.out.println(k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new S().new X();

        x.pro();
    }
}


// S.java:4: error: cannot find symbol
//             System.out.println(k);
//                                ^
//   symbol:   variable k
//   location: class S.X
// 1 error
