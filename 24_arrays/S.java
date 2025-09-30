class S {
    public static void main(String[] args) {
        Animal[] x = new Animal[3];

        Cat a = new Cat();
        Dog b = new Dog();
        Cow c = new Cow();

        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        x[0] = a;
        x[1] = b;
        x[2] = c;

        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }    
}

