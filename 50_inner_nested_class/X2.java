class JJ {
    void pro() {
        System.out.println("Ninja Hathodi");
    }
}

class X2 {
    JJ x = new JJ() {
        void pro() {
            System.out.println("VirendraVikram");
        }
    };

    public static void main(String[] args) {
        X2 a = new X2();

        a.x.pro();
    }
}
