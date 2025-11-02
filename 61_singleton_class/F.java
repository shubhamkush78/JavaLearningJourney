// Singleton Class:
// step 1: declare all the constructors private so that no one can create an instance of singleton class X6
// step 2: declare a static variable of the singleton-class-type and assign an object of the singleton-class
// step 3: define a static method which will create an instance of singleton-class's object if one doesn't exist and returns

class X6 {
    private static X6 a;

    private X6() {

    }

    // lazy initialization
    static X6 createInstance() {
        if(a == null)
            a = new X6();

        return a;
    }
}

class F {
    public static void main(String[] args) {
        // X6 a = new X6();

        // X6 a = X6.a;
        // X6 b = X6.a;
        // X6 c = X6.a;
        
        X6 a = X6.createInstance();
        X6 b = X6.createInstance();
        X6 c = X6.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }    
}
