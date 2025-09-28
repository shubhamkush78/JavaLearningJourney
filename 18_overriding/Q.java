class Q {
    public static void main(String[] args) {
        Cat cat = new Cat();
        playSound(cat);

        Dog dog = new Dog();
        playSound(dog);

        Cow cow = new Cow();
        playSound(cow);

        BDog bdg = new BDog();
        playSound(bdg);

        Animal anm = new Animal();
        playSound(anm);
    }

    static void playSound(Animal x) {
        x.makeSound();
    }

    /* 
    static void playSound(Cat x) {
        x.makeSound();
    }

    static void playSound(Dog x) {
        x.makeSound();
    }
    
    static void playSound(Cow x) {
        x.makeSound();
    }*/
}