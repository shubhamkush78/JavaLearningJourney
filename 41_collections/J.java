import java.util.TreeSet;
import java.util.Iterator;

class J {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add(new String("om"));
        set.add(new String("ram"));
        set.add(new String("golu"));
        set.add(new String("sonu"));
        set.add(new String("bablu"));

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());            
        }
    }
}
