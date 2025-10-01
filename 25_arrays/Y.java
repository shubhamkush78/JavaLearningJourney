class Y {
    public static void main(String[] args) {
        String[][] x 
            = {
                {"A", "B", "C", "D"},
                {"1", "2", "3", "4", "5", "6", "7"},
                {"#", "$", "%"}
            };
        
        for(String[] y : x) {
            for(String next : y) {
                System.out.print(next+ " ");
            }
            System.out.println();
        }
        // for(int i=0;i<x.length; i++) {
        //     for(int j=0;j<x[i].length;j++) {
        //         System.out.print(x[i][j] + "  ");
        //     }
        //     System.out.println();
        // }        
    }
}
