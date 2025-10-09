class Q {
    int y = 99;
    
    class X {
        void pro() {
            System.out.println(y);
            System.out.println(this.y);
        }
    }

    public static void main(String[] args) {
        Q q = new Q();
        X x = q.new X();
        x.pro();
    }
}


// Q.java:7: error: cannot find symbol
//             System.out.println(this.y);
//                                    ^
//   symbol: variable y
// 1 error