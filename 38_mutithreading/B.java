class ARunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(x.getName() + " - " + x.isDaemon());

        for(int i=0;i<2000;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class B {
    public static void main(String[] args) {
        Thread t = new Thread(new ARunnable(), "A");
        t.setDaemon(true);
        
        t.start();

        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }    
}