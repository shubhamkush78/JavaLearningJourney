class K {
    void pro() {
        enum CoffeeMugSize {
            SMALL, MEDIUM, LARGE
        }

        CoffeeMugSize x = CoffeeMugSize.MEDIUM;

        System.out.println(x);
    }    

    public static void main(String[] args) {
        new K().pro();
    }
}