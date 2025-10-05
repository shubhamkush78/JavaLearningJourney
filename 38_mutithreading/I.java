class I {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        ThreadGroup tg = t.getThreadGroup();

        System.out.println("Inside main(): Thread Name: " + t.getName() + " Thread Group Name: " + tg.getName());

        ThreadGroup parent = tg.getParent();
        System.out.println("main Thread Groups's parent Thread Group: " + parent.getName());
        
        ThreadGroup parentKaParent = parent.getParent();
        System.out.println("system Thread Groups's parent Thread Group: " + parentKaParent.getName());
    }    
}
