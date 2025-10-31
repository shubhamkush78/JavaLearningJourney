@FunctionalInterface
interface E5 {
    void pro();
}

@FunctionalInterface
interface E6 extends E5 {
    void info();
}


// G.java:6: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   E6 is not a functional interface
//     multiple non-overriding abstract methods found in interface E6
// 1 error