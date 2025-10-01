class V {
    public static void main(String[] args) {
        int[][] x = new int[2][];

        x[0] = new int[4];
        x[1] = new int[2];

        x[0][0] = 45;
        x[0][1] = 9;
        x[0][2] = 12;
        x[0][3] = 91;

        x[1][0] = 5;
        x[1][1] = 71;

        System.out.println(x[0][3]);
    }    
}
