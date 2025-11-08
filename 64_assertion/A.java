class A {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        
        //---- 
        System.out.println("Before: " + x);
        //----
        
        //Simple Assertion
        assert x != 2;

        System.out.println("After: " + x);
    }   
}