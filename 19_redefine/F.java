class R {

}

class Q extends R {
    void pro() {
        System.out.println("Hello");
    }
}

class F {
    public static void main(String[] args) {
        R e = new Q();

        e.pro();
    }
}



// F.java:15: error: cannot find symbol
//         e.pro();
//          ^
//   symbol:   method pro()
//   location: variable e of type R
// 1 error
