class P2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        playSound(cat);

        Dog dog = new Dog();
        playSound(dog);
    }

    static void playSound(Cat x) {
        x.makeSound();
    }

    static void playSound(Dog x) {
        x.makeSound();
    }
}