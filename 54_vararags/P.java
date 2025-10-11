class P {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 78;
        short c = 255;
        int d = 3456;
        
        pro(a, b, c, d);
    }   
    
    static void pro(int... args) {
        for(int arg : args)
            System.out.println(arg);
    }
}
