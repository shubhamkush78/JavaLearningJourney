class L1Thread extends Thread {
    public void run() {
        YY.pro();
    }
}

class L2Thread extends Thread {
    public void run() {
        ZZ.info();
    }
}

class S {
    public static void main(String[] args) {
        L1Thread x = new L1Thread();
        x.setName("A");

        L2Thread y = new L2Thread();
        y.setName("B");

        x.start();
        y.start();
    }    
}

class YY {
    synchronized static void pro() {
        Thread t = Thread.currentThread();

        try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace();  }
        ZZ.info();
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class ZZ {
    synchronized static void info() {
        Thread t = Thread.currentThread();
        
        try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace();  }
        YY.pro();
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}
