abstract class II {
    abstract void pro(); 
}

class X1 {
    II x = new II() {
        void pro() {
            System.out.println("Jai Ho");
        }
    };

    public static void main(String[] args) {
        X1 a = new X1();

        a.x.pro();
    }
}
