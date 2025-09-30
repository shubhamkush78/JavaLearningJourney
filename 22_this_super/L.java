class L {
    L() {
        System.out.println(this);
    }
    
    public static void main(String[] args) {
        L x = new L();

        System.out.println(x);

        x.pro();
    }

    void pro() {
        System.out.println(this);
    }
}