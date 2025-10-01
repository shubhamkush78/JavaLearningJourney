class D {
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


        for(String[][] next : x) {
            for(String[] y : next) {
                for(String nx : y) {
                    System.out.print(nx + " ");
                }
                System.out.println();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~");
        }                
    }    
}
