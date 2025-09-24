package a.b;

import x.y.z.B;

class A {
    public static void main(String[] args) {
        x.B m = new x.B();
        // x.y.z.B n = new x.y.z.B();
        B n = new B();

        System.out.println(m.y);
        System.out.println(n.y);

        m.pro();
        n.pro();
    }
}