class R {
    public static void main(String[] args) {
        String x = "om";
        String y = x;
        x = "ram";
        String z = "om";

        System.out.println(y == z);
    }
}