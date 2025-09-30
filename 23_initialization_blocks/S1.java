class S1 {
    {
        System.out.println("A");
        int y = 12/0;
        System.out.println("Y");
    }   
    
    public static void main(String[] args) {
        System.out.println("H");

        S1 x = new S1();
        
        System.out.println("J");
    }
}