
class X13 implements Cloneable {
    private static X13 a;

    private X13() {
        System.out.println("#####################");
    }

    public Object clone() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }

    // lazy initialization
    public static X13 createInstance() {
        if(a == null)
            a = new X13();

        return a;
    }
}

class I {
    public static void main(String[] args) throws Exception {        
        
        X13 a = X13.createInstance();
        X13 b = X13.createInstance();
        X13 c = X13.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        X13 y = (X13)a.clone();

        System.out.println("~~~~~~~~~~~~~~~~##~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}
