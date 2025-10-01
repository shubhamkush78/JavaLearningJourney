class L {
    public static void main(String[] args) {
        int[] x = {67, 34, 78, 12, 90, 23, 19, 120};

        int max = x[0];

        for(int i = 0; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }

        System.out.println("Max number found is: " + max);
    }    
}
