class H {
    public static void main(String[] args) {
        System.out.println(1);

        Throwable x = new Throwable();

        if(12<13)
            throw x;

        System.out.println(2);
    }    
}

// H.java:8: error: unreported exception Throwable; must be caught or declared to be thrown
//             throw x;
//             ^
// 1 error
