class P1 {
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = x;

        System.out.println(x);

        x++;

        System.out.println(x);
        System.out.println(x == y);
    }    
}
