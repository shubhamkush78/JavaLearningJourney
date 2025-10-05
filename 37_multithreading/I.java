class IThread extends Thread {
    public void run() {        
        I.pro(); 
    }
}

class JThread extends Thread {
    public void run() {        
        I.info();             
    }
}

class I {
    public static void main(String[] args) {
        IThread a = new IThread();
        a.setName("A");
        
        JThread b = new JThread();
        b.setName("B");

        a.start();
        b.start();
    }    

    static void pro() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++)
            System.out.println(i + " - pro() - " + t.getName());
    }

    static void info() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++)
            System.out.println(i + " - info() - " + t.getName());
    }
}
