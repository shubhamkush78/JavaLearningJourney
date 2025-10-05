class JThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class N {
    public static void main(String[] args) {
        JThread t = new JThread();
        t.setName("A");
        t.start();

        Thread x = Thread.currentThread();
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + x.getName());
    }    
}
