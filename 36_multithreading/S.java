class C1Runnable implements Runnable {
    public void run() {
        Thread x = new Thread(new D1Runnable(), "Bablu");
        x.start();
        try { x.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        Thread t = Thread.currentThread();        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class D1Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName());
            if(i==15)
                try { S.y.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class S {
    static Thread y;
    public static void main(String[] args) {
        y = Thread.currentThread();
        
        Thread x = new Thread(new C1Runnable(), "Golu");
        x.start();

        try { x.join(); } catch(InterruptedException e) { e.printStackTrace(); }        
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + y.getName());
    }    
}
