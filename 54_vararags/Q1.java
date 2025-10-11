class Q1 {
    public static void main(String[] args) {
        BDog a = new BDog();
        Dog b = new Dog();
        Cat c = new Cat();
        Cow d = new Cow();
        Animal e = new Animal();
        LivingBeing f = new Cat();
        
        pro(a, b, c, d, e, f);
    }   
    
    static void pro(Animal... animals) {
        for(Animal animal : animals)
            System.out.println(animal);
    }
}



// Q1.java:10: error: method pro in class Q1 cannot be applied to given types;
//         pro(a, b, c, d, e, f);
//         ^
//   required: Animal[]
//   found:    BDog,Dog,Cat,Cow,Animal,LivingBeing
//   reason: varargs mismatch; LivingBeing cannot be converted to Animal
// 1 error