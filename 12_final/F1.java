final class U1 {
    int y = 99;
}

class F1 {
    public static void main(String[] args) {
        U1 u = new U1();

        System.out.println(u.y);

        u.y = 999;

        System.out.println(u.y);
    }
}
