class Q2 {
    public static void main(String[] args) {
        BDog a = new BDog();
        Dog b = new Dog();
        Cat c = new Cat();
        Cow d = new Cow();
        Animal e = new Animal();
        LivingBeing f = new Cat();
        
        pro(a, b, c, d, e, (Animal)f);
    }   
    
    static void pro(Animal... animals) {
        for(Animal animal : animals)
            System.out.println(animal);
    }
}
