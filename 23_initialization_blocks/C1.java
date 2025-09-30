class C1 {
    {
        System.out.println("B");
    }    

    {
        System.out.println("C");
    }    
    
    {
        System.out.println("A");
    }   
    
    public static void main(String[] args) {
        C1 x1 = new C1();
        C1 x2 = new C1();
    }
}
