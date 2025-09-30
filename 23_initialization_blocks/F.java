class F {
    {
        System.out.println("A-");
        System.out.println("B-");
        System.out.println("C-");
        System.out.println("D-");
    }

    F() {
        System.out.println("~~~F()~~~~");
    }   
    
    F(int y) {
        this();
        System.out.println("~~~F(int)~~~~");
    }

    public static void main(String[] args) {        
        F a2 = new F(12);
    }
}
