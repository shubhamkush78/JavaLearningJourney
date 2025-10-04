class C {
    public static void main(String[] args) {
        System.out.println(1);

        
        try {
            System.out.println('A');
        } catch(ArithmeticException e) {
            System.out.println("Hello");
        }
        

        System.out.println(2);
    }    
}
