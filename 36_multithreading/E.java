class E {
    public static void main(String[] args) {

        E.pro();
        E.info();
    }   
    
    static void pro() {
        Thread t = Thread.currentThread();
        for(int i=0;i<50;i++)
            System.out.println(i + " - pro - " + t.getName());
    }

    static void info() {
        Thread t = Thread.currentThread();
        for(int i=0;i<50;i++)
            System.out.println(i + " - info - " + t.getName());
    }
}
