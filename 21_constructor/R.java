
class R {
    R() {
        this(10);
        System.out.println(8);
    }
    
    R(int x) {
        this();
        System.out.println(3);
    }

    public static void main(String[] args) { 
        System.out.println(5);
        R a = new R();
        System.out.println(1);
    }    
}


// R.java:3: error: recursive constructor invocation
//     R() {
//     ^
// 1 error
