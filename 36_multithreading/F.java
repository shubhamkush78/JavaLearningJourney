class CThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + " - " + t.getId());
    }
}

class F {
    public static void main(String[] args) {
        CThread x1 = new CThread();
        // x1.setName("A");
        
        CThread x2 = new CThread();
        // x2.setName("B");
        
        CThread x3 = new CThread();
        // x3.setName("C");
        
        x1.start();
        x2.start();
        x3.start();
        
        Thread t = Thread.currentThread();
        
        System.out.println(t.getName() + " - " + t.getId());
    }    
}
