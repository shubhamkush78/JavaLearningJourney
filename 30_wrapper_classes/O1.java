class O1 {
    public static void main(String[] args) {
        // Short x = Short.valueOf((short)128);
        // Short y = Short.valueOf((short)128);

        Short x = Short.valueOf((short)127);
        Short y = Short.valueOf((short)127);

        System.out.println(x == y);
    }    
}
