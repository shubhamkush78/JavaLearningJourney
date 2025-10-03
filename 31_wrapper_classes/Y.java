class Y {
    public static void main(String[] args) {
        byte a = 2;
        short b = 30;

        Object j = a;
        Object k = b;
        Object l = 2;
        Object m = 2L;
        Object n = 2.3f;
        Object o = 2.3;

        Object p = 'A';
        Object q = true;

        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
    }    
}

// Boxing then Conversion...