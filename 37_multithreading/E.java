class DThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<5; i++) {
            System.out.println(i + " - " + t.getName() + " going to withdraw Rs10. & The balance is: " + E.ac.getBalance());
            
            E.ac.withdraw(10);
            
            System.out.println(i + " - " + t.getName() + " after withdrawal The balance is: " + E.ac.getBalance());
        }

        try { Thread.sleep(10000); } catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println("Final The balance is: " + E.ac.getBalance());
    }
}

class E {
    static Account2 ac = new Account2();
    public static void main(String[] args) {
        DThread x1 = new DThread();
        x1.setName("Mohan");

        DThread x2 = new DThread();
        x2.setName("Sohan");

        x1.start();
        x2.start();
    }    
}
