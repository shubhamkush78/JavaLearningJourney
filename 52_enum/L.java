enum CoffeeMugSize {
    SMALL(200), MEDIUM(300), LARGE(500);

    int size;

    CoffeeMugSize(int size) {
        this.size = size;
    }
}

class L {
    public static void main(String[] args) {
        CoffeeMugSize mug = CoffeeMugSize.MEDIUM;

        System.out.println(mug);
        System.out.println(mug.size);
    }    
}


