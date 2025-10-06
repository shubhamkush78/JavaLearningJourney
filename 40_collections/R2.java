import java.util.HashSet;
import java.util.Iterator;

class R2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("jagtap");
        set.add("makhan");
        set.add("acp pradumn");
        set.add("daya");
        set.add("salunke");

        System.out.println(set);

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()) {
            String str = itr.next();
            
            System.out.println(str);
        }
    }
}