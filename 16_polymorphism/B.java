class X { }
class Y { }
class Z { }

class B {
    public static void main(String[] args) {
        Object o1 = new X();
        Object o2 = new Y();
        Object o3 = new Z();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}
