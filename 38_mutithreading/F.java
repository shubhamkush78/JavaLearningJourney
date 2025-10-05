class BRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(2000); } catch(InterruptedException e) { e.printStackTrace();}
    }
}

class F {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BRunnable(), "Bharat");
        Thread t2 = new Thread(new BRunnable(), "Japan");
        Thread t3 = new Thread(new BRunnable(), "Australia");
        Thread t4 = new Thread(new BRunnable(), "USA");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Thread t = Thread.currentThread();
        
        ThreadGroup tg = t.getThreadGroup();

        System.out.println("Inside main(): Thread Name: " + t.getName() + " Thread Group Name: " + tg.getName());
    
        tg.list();
    }    
}
