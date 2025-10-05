class E2Thread extends Thread {
    public void run() {        
        O.x.pro(); 
    }
}

class HThread extends Thread {
    public void run() {        
        O.x.info();             
    }
}

class O {
    static O x = new O();
    public static void main(String[] args) {
        E2Thread a = new E2Thread();
        a.setName("A");
        
        HThread b = new HThread();
        b.setName("B");

        a.start();
        b.start();
    }    

    void pro() {
        Thread t = Thread.currentThread();        
        
        synchronized(this) {
            for(int i=0;i<30;i++) {
                System.out.println(i + " - pro() - " + t.getName());
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
    
    static void info() {
        Thread t = Thread.currentThread();        
        
        synchronized(O.x) {
            for(int i=0;i<30;i++) {
                System.out.println(i + " - info() - " + t.getName());
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}
