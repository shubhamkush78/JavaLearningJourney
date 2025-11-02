import java.lang.reflect.Constructor;


class X11 {
    private static X11 a;

    private X11() {
        System.out.println("#####################");
    }

    // lazy initialization
    public static X11 createInstance() {
        if(a == null)
            a = new X11();

        return a;
    }
}

class H1 {
    public static void main(String[] args) throws Exception {        
        
        X11 a = X11.createInstance();
        X11 b = X11.createInstance();
        X11 c = X11.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Class k = X11.class;
        Constructor[] arr = k.getDeclaredConstructors();

        arr[0].setAccessible(true);
        X11 y = (X11)arr[0].newInstance();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}
