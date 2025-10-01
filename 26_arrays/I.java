class I {
    public static void main(String[] args) {
        Z[] x = {new DD(), new EE()};

        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
    }    
}


abstract class Z { }

class DD extends Z { }
class EE extends Z { }