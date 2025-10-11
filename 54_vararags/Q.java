class Q {
    public static void main(String[] args) {
        BDog a = new BDog();
        Dog b = new Dog();
        Cat c = new Cat();
        Cow d = new Cow();
        Animal e = new Animal();
        
        pro(a, b, c, d, e);
    }   
    
    static void pro(Animal... animals) {
        for(Animal animal : animals)
            System.out.println(animal);
    }
}
