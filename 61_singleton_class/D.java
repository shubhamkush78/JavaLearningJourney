// Singleton Class:
// step 1: declare all the constructors private so that no one can create an instance of singleton class X3
// step 2: declare a static variable of the singleton-class-type and assign an object of the singleton-class

class X3 {
    // early initialization
    public static X3 a = new X3();

    private X3() {

    }
}

public class D {
    public static void main(String[] args) {
        // X3 a = new X3();
        X3 a = X3.a;
        X3 b = X3.a;
        X3 c = X3.a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }    
}
