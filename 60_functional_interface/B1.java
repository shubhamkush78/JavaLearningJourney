// functional interface

@FunctionalInterface
interface B1 {
    void pro();    
    void info();    
}


// B1.java:3: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   B1 is not a functional interface
//     multiple non-overriding abstract methods found in interface B1
// 1 error
