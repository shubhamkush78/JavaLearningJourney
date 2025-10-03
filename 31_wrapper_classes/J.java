class J {
    public static void main(String[] args) {
        Boolean x = true;
        boolean y = true;

        String s1 = x.toString();
        // String s2 = y.toString();
        String s2 = Boolean.toString(y);

        System.out.println(s1);
        System.out.println(s2);
    }    
}
