class U1 {
    static void pro() {
        System.out.println("namaste");
    }
}

class V1 extends U1 {
    static void pro() {
        System.out.println("hello");
    }
}

class C1 {
    public static void main(String[] args) {
        V1 u = new V1();

        u.pro();
    }
}
