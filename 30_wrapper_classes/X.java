class X {
    public static void main(String[] args) {
        short a = 56;

        Short x = new Short(a);
        Short y = a;

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }    
}
