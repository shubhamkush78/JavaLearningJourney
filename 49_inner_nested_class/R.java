class R {
    class X {
        int w = 90;
    }   
    
    public static void main(String[] args) {
        R r = new R();
        X m = r.new X();

        System.out.println(w);
    }
}


// R.java:10: error: cannot find symbol
//         System.out.println(w);
//                            ^
//   symbol:   variable w
//   location: class R
// 1 error
