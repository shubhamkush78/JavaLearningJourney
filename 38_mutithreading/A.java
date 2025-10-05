class D1Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(x.getName() + " - " + x.isDaemon());

        Thread t = new Thread(new D2Runnable(), "B");
        // t.setDaemon(false);
        t.start();
    }
}

class D2Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x.getName() + " - " + x.isDaemon());
    }
}

class A {
    public static void main(String[] args) {
        Thread t = new Thread(new D1Runnable(), "A");
        t.setDaemon(true);
        
        t.start();

        Thread x = Thread.currentThread();
        for(int i=0;i<100;i++)
            System.out.println(i + " - " + x.getName());
    }    
}