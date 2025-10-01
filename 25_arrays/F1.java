class F1 {
    public static void main(String[] args) {
        //not ok
        int[] x;
        x = {10, 20, 40, 50, 60, 70};

        //ok
        // int[] x = {10, 20, 40, 50, 60, 70};
        
        System.out.println(x.length);
    }    
}