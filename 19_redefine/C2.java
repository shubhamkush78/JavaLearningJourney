class U2 {
    static void pro() {
        System.out.println("chotabeem");
    }
}

class V2 extends U2 {
    static void pro() {
        System.out.println("kaliya");
    }
}

class C2 {
    public static void main(String[] args) {
        U2 u = new V2();

        u.pro();
        // compiler will convert it to : U2.pro()
    }
}
