/*final*/ class T2 {
    void pro() {
        System.out.println("pro() in T2");
    }

    final void info() {
        System.out.println("info() in T2");
    }

    void process() {
        System.out.println("process() in T2");
    }
}

class H2 extends T2 {
    void pro() {
        System.out.println("pro() in H2");
    }

    void info() {
        System.out.println("info() in H2");
    }

    void process() {
        System.out.println("process() in H2");
    }

    public static void main(String[] args) {
        
    }
}




// H2.java:20: error: info() in H2 cannot override info() in T2
//     void info() {
//          ^
//   overridden method is final
// 1 error