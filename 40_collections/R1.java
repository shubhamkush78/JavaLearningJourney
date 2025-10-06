import java.util.HashSet;
import java.util.Iterator;

class R1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("jagtap");
        set.add("makhan");
        set.add("subodh");
        set.add("daya");
        set.add("salunke");

        System.out.println(set);

        Iterator itr = set.iterator();

        while(itr.hasNext()) {
            String str = (String)itr.next();
            
            System.out.println(str);
        }
    }
}