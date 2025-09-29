class XYZ {
    XYZ(int a) {
        System.out.println(a);
    }
}

class Z1 extends XYZ {
    int q = 99;

    Z1() {
        super(q);
    }

    public static void main(String[] args) {
        Z1 x = new Z1();

        
    }    
}


// Z1.java:11: error: cannot reference q before supertype constructor has been called
//         super(q);
//               ^
// 1 error
