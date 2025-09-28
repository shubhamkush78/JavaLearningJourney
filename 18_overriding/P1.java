class P1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        playSound(cat);

        Dog dog = new Dog();
        playSound(dog);
    }

    static void playSound(Cat x) {
        x.makeSound();
    }
}



// P1.java:7: error: incompatible types: Dog cannot be converted to Cat
//         playSound(dog);
//                   ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error