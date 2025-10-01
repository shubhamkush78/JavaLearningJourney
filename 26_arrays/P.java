class P {
    public static void main(String[] args) {
        int[][] x = {{10, 20, 30, 40, 50}, {2, 4, 6}, {9, 8, 7, 6}};
        int[][] y = new int[x.length][];

        for(int i = 0; i < x.length; i++) {
            y[i] = new int[x[i].length];
            for(int j = 0; j < x[i].length; j++) {
                y[i][j] = x[i][j];
            }
        }

        for(int[] next : y) {
            for(int nx : next)
                System.out.print(nx + " ");
            
            System.out.println();
        }
    }    
}
