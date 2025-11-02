class W2  implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;

        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }
}

class Z2 extends W2 {
    private static Z2 a;

    private Z2() {
        System.out.println("#####################");
    }

    // laZ2y initialiZ2ation
    public static Z2 createInstance() {
        if(a == null)
            a = new Z2();

        return a;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("A singleton Class: You can't Instantiate");
    }
}

class I3 {
    public static void main(String[] args) throws Exception {        
        
        Z2 a = Z2.createInstance();
        Z2 b = Z2.createInstance();
        Z2 c = Z2.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Z2 y = (Z2)a.clone();

        System.out.println("~~~~~~~~~~~~~~~~#~~~~~#~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}
