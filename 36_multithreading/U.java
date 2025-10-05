class ERunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<200;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class U {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ERunnable(), "Kaliya");
        t.start(); 

        t.join(20);

        Thread x = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + x.getName());
    }    
}
