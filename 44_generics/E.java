class CC<Q> {
    void pro(Q a) {

    }
}

class E {
    public static void main(String[] args) {

        CC<Student> c = new CC<Student>();
        c.pro(12);
        c.pro("om");
        c.pro(true);
        c.pro(new Student());
        
        
        CC<Integer> b = new CC<Integer>();
        b.pro(12);
        b.pro("om");
        b.pro(true);
        b.pro(new Student());
        

        CC a = new CC();
        a.pro(12);
        a.pro("om");
        a.pro(true);
        a.pro(new Student());
    }    
}
