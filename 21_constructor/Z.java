class XYZ {
    XYZ(int a) {
        System.out.println(a);
    }
}

class Z extends XYZ {
    int q = 99;

    Z() {
        super(22);
    }

    public static void main(String[] args) {
        Z x = new Z();

        
    }    
}
