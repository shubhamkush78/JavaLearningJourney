class BRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class Q {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new BRunnable(), "Kaliya");
        t.start(); 

        t.join();

        Thread x = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + x.getName());
    }    
}
