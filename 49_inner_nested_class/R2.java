class R2 {
    class X {
        int w = 900;
    }   
    
    public static void main(String[] args) {
        R2 r = new R2();
        X m = r.new X();

        // System.out.println(w);
        // System.out.println(r.w);
        System.out.println(m.w);
    }
}