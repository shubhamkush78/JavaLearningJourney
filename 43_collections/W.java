import java.util.ArrayList;
import java.util.Collections;

class W {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("mahesh");
        list.add("suresh");
        list.add("rajesh");
        list.add("durgesh");
        list.add("ganesh");

        System.out.println(list);
        
        // list must be sorted before you perform binary search...
        
        // int index = Collections.binarySearch(list, "rajesh");
        // int index = Collections.binarySearch(list, "suresh");
        int index = Collections.binarySearch(list, "ganesh");
        
        System.out.println(index);
    }
}
