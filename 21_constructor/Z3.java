class XYZ {
    XYZ() {
        System.out.println("++++");
    }
}

class Z3 extends XYZ {
    int q = 77;

    Z3() {
        super();

        System.out.println(q);
    }

    public static void main(String[] args) {
        Z3 x = new Z3();

        
    }    
}