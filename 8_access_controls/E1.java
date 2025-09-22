class F1 {
    private int y = 101;

    void pro() {
        System.out.println(y);
    }
}

class E1 {
    public static void main(String[] args) {
        F1 x = new F1();

        // System.out.println(x.y);

        x.pro();
    }    
}
