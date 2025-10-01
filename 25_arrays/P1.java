class P1 {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50};

        int[] y = new int[x.length];

        for(int next : y) {
            System.out.println(next);
        }

        for(int i=0, j=x.length-1; i < x.length; i++, j--) {
            y[j] = x[i];
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");
        for(int next : y) {
            System.out.println(next);
        }
    }    
}
