class E2Thread extends Thread {
    public void run() {        
        H.x.pro(); 
    }
}

class HThread extends Thread {
    public void run() {        
        H.x.info();             
    }
}

class H {
    static H x = new H();
    public static void main(String[] args) {
        E2Thread a = new E2Thread();
        a.setName("A");
        
        HThread b = new HThread();
        b.setName("B");

        a.start();
        b.start();
    }    

    synchronized void pro() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++)
            System.out.println(i + " - pro() - " + t.getName());
    }

    synchronized void info() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++)
            System.out.println(i + " - info() - " + t.getName());
    }
}
