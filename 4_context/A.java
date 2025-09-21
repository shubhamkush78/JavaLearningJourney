class A {
    int y = 99;

    public static void main(String[] args) {

        System.out.println(y);
    }
}

// A.java:6: error: non-static variable y cannot
//  be referenced from a static context
//         System.out.println(y);
//                            ^
// 1 error
