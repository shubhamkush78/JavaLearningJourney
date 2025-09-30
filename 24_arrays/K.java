class K {
    public static void main(String[] args) {
        int[] x = new int[3];

        x[0] = 34;
        x[1] = 78;
        x[2] = 9;

        for(int i = x.length-1; i >= 0; i--) {
            System.out.println(x[i]);
        }
    }    
}
