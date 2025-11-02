class W1  implements Cloneable {
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

class Z extends W1 {
    private static Z a;

    private Z() {
        System.out.println("#####################");
    }

    // lazy initialization
    public static Z createInstance() {
        if(a == null)
            a = new Z();

        return a;
    }
}

class I1 {
    public static void main(String[] args) throws Exception {        
        
        Z a = Z.createInstance();
        Z b = Z.createInstance();
        Z c = Z.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Z y = (Z)a.clone();

        System.out.println("~~~~~~~~~~~~~~~~#~~~~~#~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}
