public class M {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(34);
        Integer j = Integer.valueOf(34);
        Integer k = Integer.valueOf(11);

        System.out.println(i.compareTo(k));
        System.out.println(k.compareTo(i));
        System.out.println(j.compareTo(i));
    }
}
