class X {
    public static void main(String[] args) {
        String[][] x 
            = {
                {"A", "B", "C", "D"},
                {"1", "2", "3", "4", "5", "6"},
                {"#", "$", "%"}
            };
        
        
        for(int i=0;i<x.length; i++) {
            for(int j=0;j<x[i].length;j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }        
    }
}
