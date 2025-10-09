class P {
    static void pro() {
        class RRR {

        }
    }     

    public static void main(String[] args) {
        pro();
        RRR x = new RRR();
    }
}


// P.java:10: error: cannot find symbol
//         RRR x = new RRR();
//         ^
//   symbol:   class RRR
//   location: class P
// P.java:10: error: cannot find symbol
//         RRR x = new RRR();
//                     ^
//   symbol:   class RRR
//   location: class P
// 2 errors
