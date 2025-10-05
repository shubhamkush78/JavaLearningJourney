class E {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        ThreadGroup tg = t.getThreadGroup();

        System.out.println("Inside main(): Thread Name: " + t.getName() + " Thread Group Name: " + tg.getName());
    
        tg.list();
    }    
}
