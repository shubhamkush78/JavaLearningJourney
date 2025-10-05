class LThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t);
    }
}

class Y1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);              
        
        LThread x = new LThread();
        x.setName("A");
        x.start();
        
        t.setPriority(8);
        System.out.println(t);
    }    
}
