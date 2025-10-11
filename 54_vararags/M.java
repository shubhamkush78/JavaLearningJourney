class M {
    public static void main(String[] args) {
        int[] x = {55,66,77,99};

        int[] y = pro(x);

        for(int n : y)
            System.out.println(n);
    }   
    
    static int[] pro(int... x) {
        return x;
    }
}
