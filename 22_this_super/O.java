class E1 {
    int y = 90;
}

class O extends E1 {
    public static void main(String[] args) {
        O x = new O();

        x.pro();
    }

    void pro( ) {
        System.out.println(this.y);
        System.out.println(super.y);
    }
}
