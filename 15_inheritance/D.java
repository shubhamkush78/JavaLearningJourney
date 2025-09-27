class T {

}

class X {

}

class Z extends X {

}

class D extends Z {
    public static void main(String[] args) {
        D x = new D();

        System.out.println(x instanceof D);
        System.out.println(x instanceof Z);
        System.out.println(x instanceof X);
        System.out.println(x instanceof Object);
    }
}
