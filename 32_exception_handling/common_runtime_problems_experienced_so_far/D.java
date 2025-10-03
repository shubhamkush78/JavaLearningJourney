class D {
    public static void main(String[] args) {
        Animal[] x = new Dog[3];

        x[0] = new Dog();
        x[1] = new Cat();
    }
}

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }


// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at D.main(D.java:6)