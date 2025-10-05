class Account2 {
    int balance = 50;
    
    synchronized void withdraw(int amount) {
        if(amount <= balance) {
            try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
            balance = balance - amount;
        }
    }

    synchronized int getBalance() {
        return balance;
    }
}
