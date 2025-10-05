import java.util.Date;

class B1Runnable implements Runnable {
    public void run() {
        T.pro();
    }
}

class B2Runnable implements Runnable {
    public void run() {
        T.info();
    }
}
class T {
    public static void main(String[] args) {
        Thread x = new Thread(new B1Runnable(), "A");
        Thread y = new Thread(new B2Runnable(), "B");

        long a = new Date().getTime();
        x.start();
        y.start();
        try { 
            x.join();
            y.join();
        } catch(InterruptedException e) { e.printStackTrace(); }
        long b = new Date().getTime();

        System.out.println(b - a);
    }

    static void pro() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName()); 
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); } 
        }
    }
        
    static void info() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName()); 
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); } 
        }
    }
}