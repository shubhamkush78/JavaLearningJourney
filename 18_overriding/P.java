class P {
    public static void main(String[] args) {
        Cat cat = new Cat();
        playSound(cat);
    }

    static void playSound(Cat x) {
        x.makeSound();
    }
}
