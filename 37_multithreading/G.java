class E1Thread extends Thread {
    public void run() {        
        G.x.pro(); 
    }
}

class GThread extends Thread {
    public void run() {        
        G.x.info();             
    }
}

class G {
    static G x = new G();
    public static void main(String[] args) {
        E1Thread a = new E1Thread();
        a.setName("A");
        
        GThread b = new GThread();
        b.setName("B");

        a.start();
        b.start();
    }    

    void pro() {
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
