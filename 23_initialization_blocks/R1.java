class R1 {
    

    static {
        System.out.println(x);
    }

    static int x = 99;

    public static void main(String[] args) {
        System.out.println("A");
    }    
}


// R1.java:5: error: illegal forward reference
//         System.out.println(x);
//                            ^
// 1 error