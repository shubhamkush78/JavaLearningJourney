import java.lang.reflect.Constructor;


enum X12 {
    SO;
    // private static X12 a;

    private X12() {
        System.out.println("#####################");
    }

    // lazy initialization
    // public static X12 createInstance() {
    //     if(a == null)
    //         a = new X12();

    //     return a;
    // }
}

class H2 {
    public static void main(String[] args) throws Exception {        
        
        X12 a = X12.SO;
        X12 b = X12.SO;
        X12 c = X12.SO;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Class k = X12.class;
        Constructor[] arr = k.getDeclaredConstructors();

        arr[0].setAccessible(true);
        X12 y = (X12)arr[0].newInstance();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}



// Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects