class P2 {
    public static void main(String[] args) {
        long a = 7777777777L;
        float b = 3.4f;
        double c = 4.56;
        
        int[] x = new int[3];

        x[0] = (int)a;
        x[1] = (int)b;
        x[2] = (int)c;

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }    
}