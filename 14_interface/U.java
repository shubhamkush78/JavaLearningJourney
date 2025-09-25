interface LL {
    void info();
    void pro();
}

class U implements LL {
    public void info() {
        System.out.println("Hello..");
    }
    
    // public void pro() {        
    //     System.out.println("Hi..");
    // }

    public static void main(String[] args) {
        U u = new U();

        u.info();
        u.pro();
    }
}


// U.java:6: error: U is not abstract and does not override abstract method pro() in LL
// class U implements LL {
// ^
// 1 error
