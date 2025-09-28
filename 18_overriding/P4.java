class P4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        playSound(cat);

        Dog dog = new Dog();
        playSound(dog);

        Cow cow = new Cow();
        playSound(cow);
    }

    static void playSound(Cat x) {
        x.makeSound();
    }

    static void playSound(Dog x) {
        x.makeSound();
    }
    
    static void playSound(Cow x) {
        x.makeSound();
    }
}