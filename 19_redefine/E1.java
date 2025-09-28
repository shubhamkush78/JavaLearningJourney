class Animal { }

class Cat extends Animal { }

class E1 {
    void pro(Animal x) {
        System.out.println("pro(Animal)");
    }
    
    void pro(Cat x) {
        System.out.println("pro(Cat)");
    }

    public static void main(String[] args) {
        Animal anm = new Cat();
        
        E1 y = new E1();
        y.pro(anm);
    }
}
