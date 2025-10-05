class DRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x.getName());
        System.out.println(x.isDaemon());
    }
}

class X {
    public static void main(String[] args) {
        Thread t = new Thread(new DRunnable(), "A");
        t.setDaemon(true);
        
        t.start();
    }    
}