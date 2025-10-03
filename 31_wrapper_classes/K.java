class K {
    public static void main(String[] args) {
        Integer x = 34;
        int y = 34;

        String s1 = x.toString();
        // String s2 = y.toString();
        String s2 = Integer.toString(y);

        System.out.println(s1);
        System.out.println(s2);
    }    
}
