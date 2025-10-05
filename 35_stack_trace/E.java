class Q {
    Q() {
        System.out.println(1);

        int y = 12/0;

        System.out.println(2);
    }
}

class R extends Q { }

class S extends R { }

class T extends S { }

class E extends T {
    public static void main(String[] args) {
        E a = new E();
    }    
}
