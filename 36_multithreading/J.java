class MyRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        
        System.out.println(t.getName());
    }
}

class J {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r);

        t.setName("Monu");

        t.start();

        Thread x = Thread.currentThread();
        
        System.out.println(x.getName());
    }    
}
