@FunctionalInterface
interface DD {
    int pro();
}

class X4 implements DD {
    public int pro() {
        return 78;
    }
}

class Q {
    public static void main(String[] args) {
        DD x = new X4();

        System.out.println(x.pro());
    }    
}
