class Account {
    int balance = 50;
    
    void withdraw(int amount) {
        balance = balance - amount;
    }

    int getBalance() {
        return balance;
    }
}
