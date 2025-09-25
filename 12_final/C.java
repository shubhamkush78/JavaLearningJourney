final class Y {

}

class C {
    public static void main(String[] args) {
        C c = new C();
        Y t = new Y();
        System.out.println(t);
        c.pro(t);
;    }

    void pro(Y y) {
        System.out.println("Hello ");
        System.out.println(y);
    }
}
