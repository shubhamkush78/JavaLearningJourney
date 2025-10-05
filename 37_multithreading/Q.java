class KThread extends Thread {
    public void run() {
        Q.pro();
    }
} 

class Q {
    public static void main(String[] args) {
        KThread x = new KThread();
        x.setName("A");
        x.start();
        
        Thread t = Thread.currentThread();

        synchronized(Q.class) {
            for(int i=0;i<30;i++)
                System.out.println(i + " - " + t.getName());
        }
    }   
    
    synchronized static void pro() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}
