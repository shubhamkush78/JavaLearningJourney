class C {
    public static void main(String[] args) {
        StringBuffer x = new StringBuffer("kamal");
        StringBuffer y = x;

        x.append(" ji");

        System.out.println(y);
    }
}
