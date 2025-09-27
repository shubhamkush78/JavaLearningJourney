class X { }
class B extends X { }
class C extends B { }
class D extends C { }

class A {
    public static void main(String[] args) {
        D a = new D();

        C b = new D();

        B c = new D();

        X d = new D();

        Object o = new D();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(o);
    }
}