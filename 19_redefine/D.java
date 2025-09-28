class W {
    void info() {
        System.out.println("dholu");
    }
}

class T extends W {
    void info() {
        System.out.println("bholu");
    }
}

class D {
    public static void main(String[] args) {
        W x = new W();

        x.info();
    }
}