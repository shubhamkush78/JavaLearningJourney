class FF {
    class X {
        private int raju = 777;
    }
}

class M1 {
    public static void main(String[] args) {
        FF c = new FF();
        FF.X x = c.new X();

        System.out.println(x.raju);
    }    
}
