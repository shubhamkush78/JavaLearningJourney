import java.util.HashSet;

class M {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.add(23);
        set.add(56);
        set.add(12);
        set.add(9);
        set.add(41);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
