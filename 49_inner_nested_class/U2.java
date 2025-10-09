class U2 {
    int k = 300;
    class X extends BBB {
        // int k = 30;
        void pro() {
            // int k = 3;
            System.out.println(k);
            System.out.println(this.k);
            System.out.println(super.k);
            System.out.println(U2.this.k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new U2().new X();

        x.pro();
    }
}

class BBB {
    // int k = 5555;
}


// U2.java:8: error: cannot find symbol
//             System.out.println(this.k);
//                                    ^
//   symbol: variable k
// U2.java:9: error: cannot find symbol
//             System.out.println(super.k);
//                                     ^
//   symbol: variable k
// 2 errors