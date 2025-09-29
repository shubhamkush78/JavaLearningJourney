class R1 {
    R1() {
        this();
        System.out.println("Hello");
    }    

    public static void main(String[] args) {
        System.out.println("1");
        R1 x = new R1();
        System.out.println("2");
    }
}


// R1.java:2: error: recursive constructor invocation
//     R1() {
//     ^
// 1 error
