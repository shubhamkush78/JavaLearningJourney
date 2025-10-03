class L {
    public static void main(String[] args) {
        Double x = 2.34;
        double y = 2.34;

        String s1 = x.toString();
        // String s2 = y.toString();
        String s2 = Double.toString(y);

        System.out.println(s1);
        System.out.println(s2);
    }    
}
