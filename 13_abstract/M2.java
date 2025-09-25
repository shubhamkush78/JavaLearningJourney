abstract class X12 {
    abstract void info();

    abstract void pro();
}

class M2 extends X12 {
    void pro() {
        System.out.println("Jay...");
    }

    void info() {
        System.out.println("Jay Ho...");
    }
}
