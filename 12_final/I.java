class S {
    void pro() {
        System.out.println("pro() in S");
    }

    final void info() {
        System.out.println("info() in S");
    }
}

class I extends S {
    public static void main(String[] args) {
        I i = new I();

        i.pro();
        i.info();
    }
}
