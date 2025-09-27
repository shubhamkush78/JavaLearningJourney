class J {
    public static void main(String[] args) {
        Cholai a = new Cholai();
        Norpa b = new Norpa();
        Bathua c = new Bathua();

        prepareLeafyVegetable(a);
        prepareLeafyVegetable(c);
        prepareLeafyVegetable(b);
    }

    static void prepareLeafyVegetable(Cholai x) {
    // static void prepareCholai(Cholai x) {
        System.out.println(" --- start preparing cholai .....");
        System.out.println("1");
        System.out.println("3");
        System.out.println("7");
        System.out.println("8");
    }

    static void prepareLeafyVegetable(Bathua x) {
    // static void prepareBathua(Bathua x) {
        System.out.println(" --- start preparing bathua .....");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
    }

    static void prepareLeafyVegetable(Norpa x) {
    // static void prepareNorpa(Norpa x) {
        System.out.println(" --- start preparing norpa .....");
        System.out.println("1");
        System.out.println("2");
        System.out.println("4");
        System.out.println("7");
    }
} 