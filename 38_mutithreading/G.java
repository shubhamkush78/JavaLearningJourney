class BRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(2000); } catch(InterruptedException e) { e.printStackTrace();}
    }
}

class G {
    public static void main(String[] args) {
        ThreadGroup quad = new ThreadGroup("QUAD");
        
        Thread t1 = new Thread(quad, new BRunnable(), "Bharat");
        Thread t2 = new Thread(quad, new BRunnable(), "Japan");
        Thread t3 = new Thread(quad, new BRunnable(), "Australia");
        Thread t4 = new Thread(quad, new BRunnable(), "USA");
        
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
