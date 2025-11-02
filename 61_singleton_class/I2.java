class W2  implements Cloneable {
    public Object clone() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }
}

class Z1 extends W2 {
    private static Z1 a;

    private Z1() {
        System.out.println("#####################");
    }

    // laZ1y initialiZ1ation
    public static Z1 createInstance() {
        if(a == null)
            a = new Z1();

        return a;
    }

    public Object clone() {
        return a;
    }
}

class I2 {
    public static void main(String[] args) throws Exception {        
        
        Z1 a = Z1.createInstance();
        Z1 b = Z1.createInstance();
        Z1 c = Z1.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Z1 y = (Z1)a.clone();

        System.out.println("~~~~~~~~~~~~~~~~#~~~~~#~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}
