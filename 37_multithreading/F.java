class EThread extends Thread {
    public void run() {        
        F.x.pro(); 
    }
}

class FThread extends Thread {
    public void run() {        
        F.x.info();             
    }
}

class F {
    static F x = new F();
    public static void main(String[] args) {
        EThread a = new EThread();
        a.setName("A");
        
        FThread b = new FThread();
        b.setName("B");

        a.start();
        b.start();
    }    

    void pro() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++)
            System.out.println(i + " - pro() - " + t.getName());
    }

    void info() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++)
            System.out.println(i + " - info() - " + t.getName());
    }
}
