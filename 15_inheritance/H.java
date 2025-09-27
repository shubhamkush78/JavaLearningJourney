//Single Inheritance...

class X { 
    void pro() {
        System.out.println("Hi");
    }
}

class H extends X {
    public static void main(String[] args) {
        H h = new H();

        h.pro();
    }
}
