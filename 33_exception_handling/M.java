class M {
    public static void main(String[] args) {
        LivingBeing x = new Human();

        BDog y = (BDog)x;
    }
}

class LivingBeing { }
class Animal extends LivingBeing {   }
class Dog extends Animal {   }
class BDog extends Dog {   }

class Human extends LivingBeing { }



// Exception in thread "main" java.lang.ClassCastException: class Human cannot be cast to class BDog (Human and BDog are in unnamed module of loader 'app')
//         at M.main(M.java:5)