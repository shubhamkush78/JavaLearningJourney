class M {
    public static void main(String[] args) {
        int y = 35;

        // String s2 = Integer.toString(y, 2);
        // String s2 = Integer.toBinaryString(y);
        
        // String s2 = Integer.toString(y, 8);
        // String s2 = Integer.toOctalString(y);

        // String s2 = Integer.toString(y, 16);
        String s2 = Integer.toHexString(y);

        System.out.println(s2);
    }    
}