class ARunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class J1 {
    public static void main(String[] args) {
        ARunnable r = new ARunnable();

        Thread t = new Thread(r);

        t.setName("mohan");

        t.start();

        Thread x = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + x.getName());
    }    
}
