class Z1 {
    Z1() {  System.out.println(this); }
}

class Z2 extends Z1 {
    Z2() {  System.out.println(this); }
}

class Z3 extends Z2 {
    Z3() {  System.out.println(this); }
}

class M extends Z3 {
    M() {  System.out.println(this); }
    public static void main(String[] args) {
        M x = new M();
        
        System.out.println(x);
    }
}
