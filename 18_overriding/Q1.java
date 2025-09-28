class Q1 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        playSound(a1);

        Animal a2 = new Dog();
        playSound(a2);

        Animal a3 = new Cow();
        playSound(a3);

        Animal a4 = new BDog();
        playSound(a4);

        Animal a5 = new Animal();
        playSound(a5);
    }

    static void playSound(Animal x) {
        x.makeSound();
    }
}