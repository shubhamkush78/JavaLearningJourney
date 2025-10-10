enum CoffeeMugSize {
    SMALL(200,"T"), MEDIUM(300,"E"), LARGE(500,"S");

    private int size;
    private String label;

    CoffeeMugSize(int size, String label) {
        this.size = size;
        this.label = label;
    }

    public int getSize() {
        return size;
    }

    public String getLabel() {
        return label;
    }
}

class M {
    public static void main(String[] args) {
        CoffeeMugSize[] mugs = CoffeeMugSize.values();

        for(CoffeeMugSize mug : mugs) {
            System.out.println(mug.getSize() + " - " + mug.getLabel() + " - " + mug);
        }
    }    
}
