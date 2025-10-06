public class M1 {
    public static void main(String[] args) {
        String i = String.valueOf("ram");
        String j = String.valueOf("ram");
        String k = String.valueOf("rim");

        System.out.println(i.compareTo(k));
        System.out.println(k.compareTo(i));
        System.out.println(j.compareTo(i));
    }
}
