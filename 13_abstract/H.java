abstract class X4 {
    abstract void info();
}

class H extends X4 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}



// H.java:5: error: H is not abstract and does not override abstract method info() in X4
// class H extends X4 {
// ^
// 1 error