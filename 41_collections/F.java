import java.util.HashSet;
import java.util.LinkedHashSet;

class F {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<Integer>();
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        set.add(23);
        set.add(56);
        set.add(12);
        set.add(9);
        set.add(41);
        set.add(12);

        System.out.println(set);
    }
}
