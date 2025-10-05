class BThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<5; i++) {
            System.out.println(i + " - " + t.getName() + " going to withdraw Rs10. & The balance is: " + C.ac.getBalance());
            try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
            C.ac.withdraw(10);
            System.out.println(i + " - " + t.getName() + " after withdrawal The balance is: " + C.ac.getBalance());
        }

        // try { Thread.sleep(10000); } catch(InterruptedException e) { e.printStackTrace(); }
        // System.out.println("Final The balance is: " + C.ac.getBalance());
    }
}

class C {
    static Account1 ac = new Account1();
    public static void main(String[] args) {
        BThread x1 = new BThread();
        x1.setName("Mohan");

        BThread x2 = new BThread();
        x2.setName("Sohan");

        x1.start();
        x2.start();
    }    
}
