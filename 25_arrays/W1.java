class W1 {
    public static void main(String[] args) {
        String[][] x 
            = new String[][]{
                {"A", "B", "C"},
                {"1", "2", "3", "4", "5"},
                {"#", "$"}
            };
        
        
        for(int i=0;i<x.length; i++) {
            for(int j=0;j<x[i].length;j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }        
    }
}
