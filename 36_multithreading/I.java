class FThread extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class I {
    public static void main(String[] args) {
        FThread x = new FThread();

        x.start();
        x.start();   // not ok
    }    
}


// Exception in thread "main" Hello
// java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:802)
//         at I.main(I.java:12)
