class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<5; i++) {
            System.out.println(i + " - " + t.getName() + " going to withdraw Rs10. & The balance is: " + B.ac.getBalance());
            try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
            B.ac.withdraw(10);
            System.out.println(i + " - " + t.getName() + " after withdrawal The balance is: " + B.ac.getBalance());
        }

        // try { Thread.sleep(10000); } catch(InterruptedException e) { e.printStackTrace(); }
        // System.out.println("Final The balance is: " + B.ac.getBalance());
    }
}

class B {
    static Account ac = new Account();
    public static void main(String[] args) {
        AThread x1 = new AThread();
        x1.setName("Mohan");

        AThread x2 = new AThread();
        x2.setName("Sohan");

        x1.start();
        x2.start();
    }    
}
