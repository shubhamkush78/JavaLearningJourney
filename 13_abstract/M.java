abstract class X10 {
    abstract void info();

    abstract void pro();
}

class M extends X10 {
    
}


// M.java:7: error: M is not abstract and does not override abstract method pro() in X10
// class M extends X10 {
// ^
// 1 error