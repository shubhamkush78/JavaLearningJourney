class P2 {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 78;
        short c = 255;
        int d = 3456;
        long e = 555888675645L;
        float f = 2.3f;
        double g = 5.6;
        
        pro(a, b, c, d, (int)e, (int)f, (int)g);
    }   
    
    static void pro(int... args) {
        for(int arg : args)
            System.out.println(arg);
    }
}
