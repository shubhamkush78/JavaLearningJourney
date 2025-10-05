class HThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class L {
    public static void main(String[] args) throws InterruptedException {
        HThread t = new HThread();
        t.setName("Yam");
        t.start();
        Thread x = Thread.currentThread();        
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
            if(i == 15)
                t.sleep(1000);
        }
    }    
}
