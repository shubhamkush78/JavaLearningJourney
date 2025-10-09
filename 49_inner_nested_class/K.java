class CC {
    class X {
        void pro() {
            System.out.println("Namaste");
        }
    }
}

class K {
    public static void main(String[] args) {
        CC c = new CC();
        CC.X x = c.new X();

        x.pro();
    }    
}
