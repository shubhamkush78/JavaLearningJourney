class D {
    {
        System.out.println("Y");
    }    
    
    {
        System.out.println("B");
    }  
    
    D() {
        System.out.println("H");
    }
    
    {
        System.out.println("M");
    }    

    public static void main(String[] args) {
        System.out.println("F");
        D u = new D();
        System.out.println("J");
    }
}
