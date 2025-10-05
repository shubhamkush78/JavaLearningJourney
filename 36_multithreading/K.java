class GThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class K {
    public static void main(String[] args) throws InterruptedException {
        GThread x = new GThread();
        x.setName("Kaju");
        x.start();

        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName());            
            if(i == 15)
                Thread.sleep(1000L);
        }
    }    
}
