class E {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int y = 23/0;
        } catch(ArithmeticException e) {
            //--- your solution code...
            System.out.println("Hello");
        }

        System.out.println(2);
    }    
}