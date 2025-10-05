class DRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x.getName());
        System.out.println(x.isDaemon());
    }
}

class W {
    public static void main(String[] args) {
        Thread t = new Thread(new DRunnable(), "A");
        t.start();
        
        t.setDaemon(true);
    }    
}


// Exception in thread "main" A
// java.lang.IllegalThreadStateException
// false
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
//         at W.main(W.java:15)