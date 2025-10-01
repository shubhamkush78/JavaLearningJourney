class E {
    public static void main(String[] args) {
        String[][][] x = {
                            {
                                {"A","B","C"},
                                {"1","2","3"}
                            }, 
                            {
                                {"#"},
                                {"a","b"},
                                {"$","^","~","%","@"}
                            }
                        };


        for(int i=0; i < x.length; i++) {
            for(int j=0; j < x[i].length; j++) {
                for(int k=0; k < x[i][j].length; k++) {
                    System.out.print(x[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        }               
    }    
}
