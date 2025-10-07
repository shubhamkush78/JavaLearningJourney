import java.util.ArrayList;
import java.util.Collections;

class U {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("mahesh");
        list.add("suresh");
        list.add("rajesh");
        list.add("durgesh");
        list.add("ganesh");

        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);
    }
}
