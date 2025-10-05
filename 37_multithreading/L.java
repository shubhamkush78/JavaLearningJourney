class IThread extends Thread {
    public void run() {        
        L.pro(); 
    }
}

class JThread extends Thread {
    public void run() {        
        L.x.info();             
    }
}

class L {
    static L x = new L();
    public static void main(String[] args) {
        IThread a = new IThread();
        a.setName("A");
        
        JThread b = new JThread();
        b.setName("B");

        a.start();
        b.start();
    }    

    synchronized static void pro() {
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
