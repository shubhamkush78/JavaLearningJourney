class D {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            String x = null;
        } catch(NullPointerException e) {
            System.out.println(e);
        }

        System.out.println(2);
    }    
}
