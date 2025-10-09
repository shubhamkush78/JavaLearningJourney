class R1 {
    class X {
        int w = 90;
    }   
    
    public static void main(String[] args) {
        R1 r = new R1();
        X m = r.new X();

        // System.out.println(w);
        System.out.println(r.w);
    }
}


// R1.java:11: error: cannot find symbol
//         System.out.println(r.w);
//                             ^
//   symbol:   variable w
//   location: variable r of type R1
// 1 error