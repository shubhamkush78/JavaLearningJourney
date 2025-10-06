import java.util.SortedSet;
import java.util.TreeSet;

class G {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add(new String("om"));
        set.add(new String("raju"));
        set.add(new String("ram"));
        set.add(new String("bheem"));
        set.add(new String("golu"));
        set.add(new String("sonu"));
        set.add(new String("kaliya"));
        set.add(new String("bablu"));

        System.out.println(set);

        SortedSet<String> x = set.tailSet("tilak"); 

        System.out.println(x);
    }
}
