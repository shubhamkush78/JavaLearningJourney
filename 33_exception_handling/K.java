class K {
    public static void main(String[] args) {
        try {
            int y = 12/0;
        } catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(e.getMessage());
        }
    }    
}
