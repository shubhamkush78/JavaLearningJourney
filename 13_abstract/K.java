abstract class X7 {
    abstract void info();
}

class K extends X7 {
    void info() {
        System.out.println("Hiiiiii .....!!!");
    }

    public static void main(String[] args) {
        K k = new K();

        k.info();
    }
}
