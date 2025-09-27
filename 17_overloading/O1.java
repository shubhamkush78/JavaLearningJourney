class Account {
    int balance;
}

class O1 {
    public static void main(String[] args) {
        Account x = new Account();
        x.balance = 50000;

        Account y = new Account();
        y.balance = 100000;

        System.out.println(x + y);
    }
}


// Java doesn't support operator overloading....

// O1.java:13: error: bad operand types for binary operator '+'
//         System.out.println(x + y);
//                              ^
//   first type:  Account
//   second type: Account
// 1 error