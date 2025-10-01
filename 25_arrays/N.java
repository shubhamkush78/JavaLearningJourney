class N {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50};

        int[] y = new int[x.length];

        for(int nx : y) {
            System.out.println(nx);
        }

        //----
        for(int i = 0;i < y.length; i++) {
            y[i] = x[i];
        }

        System.out.println("==================");
        for(int nx : y) {
            System.out.println(nx);
        }
    }    
}
