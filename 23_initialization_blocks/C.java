class C {
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
        C x = new C();
    }
}
