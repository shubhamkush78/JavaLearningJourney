import java.util.TreeSet;

class H {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.add(67);
        set.add(34);
        set.add(42);
        set.add(19);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
