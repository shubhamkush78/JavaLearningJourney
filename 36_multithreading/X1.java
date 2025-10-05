class X1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        t.setPriority(Thread.MAX_PRIORITY);
    }    
}