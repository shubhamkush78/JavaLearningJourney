
enum CoffeeMugSize   {
    SMALL, MEDIUM, LARGE;

    {
        System.out.println("Hello");
    }

    static {
        System.out.println("Hi");
    }
}

class S {
    public static void main(String[] args) {
        CoffeeMugSize x = CoffeeMugSize.SMALL;
    }
}
