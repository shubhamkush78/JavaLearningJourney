class DRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x.getName());
        System.out.println(x.isDaemon());
    }
}

class Y {
    public static void main(String[] args) {
        Thread t = new Thread(new DRunnable(), "A");
        t.setDaemon(true);
        
        t.start();

        Thread x = Thread.currentThread();
        for(int i=0;i<4;i++)
            System.out.println(i + " - " + x.getName());
    }    
}