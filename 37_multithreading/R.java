class A1Runnable implements Runnable {
    public void run() {
        R.pro();
    }
}

class A2Runnable implements Runnable {
    public void run() {
        R.info();
    }
}

class R {
    public static void main(String[] args) {
        new Thread(new A1Runnable(), "A").start();
        new Thread(new A2Runnable(), "B").start();
    }    

    static void pro() {
        Thread t = Thread.currentThread();

        synchronized(X1.class) {
            try{ Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); }
            synchronized(X2.class) {
                for(int i=0;i<30;i++)
                    System.out.println(i + " - " + t.getName());
            }
        }
    }

    static void info() {
        Thread t = Thread.currentThread();

        synchronized(X2.class) {
            try{ Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); }
            synchronized(X1.class) {
                for(int i=0;i<30;i++)
                    System.out.println(i + " - " + t.getName());
            }
        }
    }
}

class X1 { }
class X2 { }
