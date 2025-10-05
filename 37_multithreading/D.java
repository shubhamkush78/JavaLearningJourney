class CThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<5; i++) {
            System.out.println(i + " - " + t.getName() + " going to withdraw Rs10. & The balance is: " + D.ac.getBalance());
            if(10 <= D.ac.getBalance()) {
                try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
                D.ac.withdraw(10);
            }
            System.out.println(i + " - " + t.getName() + " after withdrawal The balance is: " + D.ac.getBalance());
        }

        // try { Thread.sleep(10000); } catch(InterruptedException e) { e.printStackTrace(); }
        // System.out.println("Final The balance is: " + D.ac.getBalance());
    }
}

class D {
    static Account1 ac = new Account1();
    public static void main(String[] args) {
        CThread x1 = new CThread();
        x1.setName("Mohan");

        CThread x2 = new CThread();
        x2.setName("Sohan");

        x1.start();
        x2.start();
    }    
}
