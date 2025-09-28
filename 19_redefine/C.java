class U {
    static void pro() {
        System.out.println("namaste");
    }
}

class V extends U {
    static void pro() {
        System.out.println("hello");
    }
}

class C {
    public static void main(String[] args) {
        U u = new U();

        u.pro();
    }
}
