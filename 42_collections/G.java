import java.util.HashMap;
import java.util.Set;

class G {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("mohan", 12);
        map.put("sohan", 23);
        map.put("rohan", 9);
        map.put("gohan", 15);
        map.put("tohan", 8);

        System.out.println(map);

        // Set<String> keys = map.keySet();
        
        for(Object key : map) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}


// G.java:18: error: for-each not applicable to expression type
//         for(Object key : map) {
//                          ^
//   required: array or java.lang.Iterable
//   found:    HashMap<String,Integer>
// 1 error
