abstract class X11 {
    abstract void info();

    abstract void pro();
}

class M1 extends X11 {
    void pro() {
        System.out.println("Jay...");
    }
}


// M1.java:7: error: M1 is not abstract and does not override abstract method info() in X11
// class M1 extends X11 {
// ^
// 1 error