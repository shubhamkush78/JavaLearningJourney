class C {
    public static void main(String[] args) {
        XYZ x = new XYZ();
        
        System.out.println("C.main(): " + x);
        x.pro();
    }    
}

class XYZ {
    void pro() {
        System.out.println("XYZ.pro(): " + this);
    }
}
