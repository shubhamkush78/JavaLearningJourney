class FRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class Z {
    public static void main(String[] args) {
        FRunnable r = new FRunnable();

        Thread t1 = new Thread(r, "A");
        Thread t2 = new Thread(r, "B");
        Thread t3 = new Thread(r, "C");

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }    
}
