// Singleton Class:
// step 1: declare all the constructors private so that no one can create an instance of singleton class X5
// step 2: declare a static variable of the singleton-class-type and assign an object of the singleton-class

class X5 {
    private static X5 a;

    private X5() {

    }

    public static X5 createInstance() {
        return new X5();
    }
}

class E {
    public static void main(String[] args) {
        // X5 a = new X5();

        // X5 a = X5.a;
        // X5 b = X5.a;
        // X5 c = X5.a;
        
        X5 a = X5.createInstance();
        X5 b = X5.createInstance();
        X5 c = X5.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }    
}
