class P3 {
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
}


// P3.java:10: error: no suitable method found for playSound(Cow)
//         playSound(cow);
//         ^
//     method P3.playSound(Cat) is not applicable
//       (argument mismatch; Cow cannot be converted to Cat)
//     method P3.playSound(Dog) is not applicable
//       (argument mismatch; Cow cannot be converted to Dog)
// 1 error