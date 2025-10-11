class P1 {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 78;
        short c = 255;
        int d = 3456;
        long e = 555888675645L;
        float f = 2.3f;
        double g = 5.6;
        
        pro(a, b, c, d, e, f, g);
    }   
    
    static void pro(int... args) {
        for(int arg : args)
            System.out.println(arg);
    }
}


// P1.java:11: error: method pro in class P1 cannot be applied to given types;
//         pro(a, b, c, d, e, f, g);
//         ^
//   required: int[]
//   found:    char,byte,short,int,long,float,double
//   reason: varargs mismatch; possible lossy conversion from long to int
// 1 error