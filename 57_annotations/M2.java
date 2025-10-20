@FunctionalInterface
interface M2 {
    void pro();
    void info();
}


// M2.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   M2 is not a functional interface
//     multiple non-overriding abstract methods found in interface M2
// 1 error