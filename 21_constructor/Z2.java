class XYZ {
    XYZ(int a) {
        System.out.println(a);
    }
}

class Z2 extends XYZ {
    static int q = 99;

    Z2() {
        super(q);
    }

    public static void main(String[] args) {
        Z2 x = new Z2();

        
    }    
}