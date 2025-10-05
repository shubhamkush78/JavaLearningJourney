class IThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();        
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName());
            try { Thread.sleep(20); } catch(InterruptedException e) { e.printStackTrace(); }                 
        }
    }
}

class M {
    public static void main(String[] args)  {
        IThread t = new IThread();
        t.setName("Yam");
        t.start();
        Thread x = Thread.currentThread();        
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
            try { Thread.sleep(20); } catch(InterruptedException e) { e.printStackTrace(); }               
        }
    }    
}
