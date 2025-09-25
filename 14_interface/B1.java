abstract class B1 {
    B1() {
        System.out.println("Hi");
    }    

    public static void main(String[] args) {
        B1 a1 = new B1();
    }
}


// B1.java:7: error: B1 is abstract; cannot be instantiated
//         B1 a1 = new B1();
//                 ^
// 1 error