import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList<? super Dog> a = new ArrayList<Dog>();
        // a.add(new Object());
        // a.add(new LivingBeing());
        // a.add(new Animal());
        a.add(new Dog());
        a.add(new BDog());
        a.add(new NDog());
        a.add(new KDog());
        
        ArrayList<? super Dog> b = new ArrayList<Animal>();
        // b.add(new Object());
        // b.add(new LivingBeing());
        // b.add(new Animal());
        b.add(new Dog());
        b.add(new BDog());
        b.add(new NDog());
        b.add(new KDog());
        
        ArrayList<? super Dog> c = new ArrayList<LivingBeing>();
        // c.add(new Object());
        // c.add(new LivingBeing());
        // c.add(new Animal());
        c.add(new Dog());
        c.add(new BDog());
        c.add(new NDog());
        c.add(new KDog());
        
        ArrayList<? super Dog> d = new ArrayList<Object>();
        // d.add(new Object());
        // d.add(new LivingBeing());
        // d.add(new Animal());
        d.add(new Dog());
        d.add(new BDog());
        d.add(new NDog());
        d.add(new KDog());
    }
}
