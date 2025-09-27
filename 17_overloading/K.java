class K {
    public static void main(String[] args) {
        Water water = new Water();
        Sugar sugar = new Sugar();
        TeaLeaves teaLeaves = new TeaLeaves();
        Milk milk = new Milk();
        Herb herb = new Herb();

        prepareMilkTea(water, sugar, teaLeaves, milk);
        prepareBlackTea(water, sugar, teaLeaves);
        prepareHerbTea(water, sugar, herb);
    }   
    
    static void prepareMilkTea(Water x, Sugar y, TeaLeaves z, Milk t) {
        System.out.println("start Milk Tea ------");
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - 4");
    }

    static void prepareBlackTea(Water x, Sugar y, TeaLeaves z) {
        System.out.println("start Black Tea ------");
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
    }

    static void prepareHerbTea(Water x, Sugar y, Herb t) {
        System.out.println("start Herb Tea ------");
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 5");
    }
}
