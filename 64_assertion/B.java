class B {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        
        //---- 
        System.out.println("Before: " + x);
        //----
        
        //Augmented Assertion
        assert x != 2 : "Some problem Occured....";

        System.out.println("After: " + x);
    }   
}