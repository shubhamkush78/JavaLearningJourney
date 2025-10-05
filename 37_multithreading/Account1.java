class Account1 {
    int balance = 50;
    
    synchronized void withdraw(int amount) {
        balance = balance - amount;
    }

    synchronized int getBalance() {
        return balance;
    }
}
