class X {
    void pro() {
        System.out.println("Hello");
    }
}

class Y extends X {
    void pro() {
        System.out.println("Hi");
    }
}

class Z extends X {
    void pro() {
        System.out.println("Bye");
    }
}

class D {
    public static void main(String[] args) {
        X a = new Y();
        X b = new Z();

        a.pro();
        b.pro();
    }
}
