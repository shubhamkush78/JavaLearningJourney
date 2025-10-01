class F {
    public static void main(String[] args) {
        // Case 4:
        X[] q = new X[2];
        System.out.println(q);
        
        // Case 3:
        // X[] q;

        // Case 2:
        // X q = new X();   // error: X is abstract; cannot be instantiated
        
        // Case 1:
        // X q;
    }    
}


interface X {

}