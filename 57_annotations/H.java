class H {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Integer x = new Integer(23);

        System.out.println(x);
    }    
}



// H.java:4: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(23);
//                     ^
// 1 warning