class DD {
    class X {
        int t = 909;
    }
}

class K1 {
    public static void main(String[] args) {
        DD c = new DD();
        DD.X x = c.new X();

        System.out.println(x.t);
    }    
}
