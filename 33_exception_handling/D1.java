class D1 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            String x = null;
            // Class.forName("java.lang.String");
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }

        System.out.println(2);
    }    
}
