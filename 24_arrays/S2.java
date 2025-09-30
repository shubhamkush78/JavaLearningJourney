class S2 {
    public static void main(String[] args) {
        LivingBeing x = new Cat();

        Animal[] a = new Animal[1];

        a[0] = (Animal)x;

        System.out.println(a[0]);
    }    
}