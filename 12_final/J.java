class Q {
    void pro() {
        System.out.println("pro() in S");
    }

    final void info() {
        System.out.println("info() in S");
    }
} 

class J {
    public static void main(String[] args) {
        Q q = new Q();

        q.pro();

        q.info();
    }
}
