class M {
    public static void main(String[] args) {
        int[] x = {67, 34, 78, 12, 90, 23, 19, 120};

        int min = x[0];

        for(int i=0; i<x.length; i++) {
            if(x[i] < min) {
                min = x[i];
            }
        }

        
        System.out.println("Min number found is: " + min);
    }    
}
