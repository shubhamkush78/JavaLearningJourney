import java.util.HashSet;

class L1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(23);
        set.add(56);
        set.add("12");
        set.add(true);
        set.add(41.34);

        System.out.println(set);
    }
}
