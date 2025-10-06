import java.util.ArrayList;
import java.util.Collections;

class W1 {
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
        
        // list must be sorted before you perform binary search...
        
        int i1 = Collections.binarySearch(list, "rajesh");
        int i2 = Collections.binarySearch(list, "suresh");
        int i3 = Collections.binarySearch(list, "ganesh");
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
