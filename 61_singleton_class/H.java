import java.lang.reflect.Constructor;
import java.io.IOException;


class X10 {
    private static X10 a;

    private X10() {
        System.out.println("#####################");
    }

    // lazy initialization
    public static X10 createInstance() {
        if(a == null)
            a = new X10();

        return a;
    }
}

class H {
    public static void main(String[] args) throws Exception {        
        
        X10 a = X10.createInstance();
        X10 b = X10.createInstance();
        X10 c = X10.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Class k = X10.class;
        Constructor[] arr = k.getDeclaredConstructors();

        X10 y = (X10)arr[0].newInstance();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}




// Exception in thread "main" java.lang.IllegalAccessException: class H cannot access a member of class X10 with modifiers "private"