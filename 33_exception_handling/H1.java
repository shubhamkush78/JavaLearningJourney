class H1 {
    public static void main(String[] args) {
        System.out.println(1);

        Exception x = new Exception();

        if(12<13)
            throw x;

        System.out.println(2);
    }    
}


// H1.java:8: error: unreported exception Exception; must be caught or declared to be thrown
//             throw x;
//             ^
// 1 error