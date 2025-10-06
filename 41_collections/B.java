public class B {
    public static void main(String[] args) {
        Teacher x = new Teacher();

        System.out.println(x);
        System.out.println(x.toString());

        System.out.println(x.hashCode());

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Integer.toHexString(x.hashCode()));
    }
}
