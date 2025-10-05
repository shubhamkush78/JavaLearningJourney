class CRunnable implements Runnable {
    public void run() {
        Thread x = new Thread(new DRunnable(), "Bablu");
        x.start();

        try { x.join(); } catch(InterruptedException e) { e.printStackTrace(); }

        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class DRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class R {
    public static void main(String[] args) {
        Thread x = new Thread(new CRunnable(), "Golu");
        x.start();

        try { x.join(); } catch(InterruptedException e) { e.printStackTrace(); }

        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }    
}
