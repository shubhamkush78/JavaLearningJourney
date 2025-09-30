class I1 {
    static {
        System.out.println(this);
    }
}

// I1.java:3: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// 1 error
