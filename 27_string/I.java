class I {
    public static void main(String[] args) {
        String x = "virendravikram";

        System.out.println(x);

        String part = x.substring(7);
        // String part = x.substring(15); // Exception
        // String part = x.substring(0);

        System.out.println(part);
        System.out.println(x);
        System.out.println(x==part);
    }    
}
