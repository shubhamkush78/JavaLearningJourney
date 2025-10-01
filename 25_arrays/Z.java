class Z {
    public static void main(String[] args) {
        // char[] x = {'A', '%', '1', '\n'};

        char[][] y = {{'1','2','3'}, {'a','z'}};

        for(char[] nx : y) {
            for(char next : nx) {
                System.out.print(next + " ");
            }
            System.out.println();
        }
    }    
}
