class E1 {
    //inner class X is an instance level member class
    class X {

    }   
    
    public static void main(String[] args) {
        E1 y = new E1();
        
        X x = y.new X();

        System.out.println(y);    
        System.out.println(x);    
    }
}