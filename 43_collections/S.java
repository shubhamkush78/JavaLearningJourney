import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.SortedMap;

class S {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        
        map.put("mohan", 12);
        map.put("sohan", 23);
        map.put("eohan", 21);
        map.put("rohan", 9);
        map.put("gohan", 15);
        map.put("johan", 7);
        map.put("tohan", 8);

        System.out.println(map);
        
        SortedMap<String,Integer> x = map.headMap("mohan");
        NavigableMap<String,Integer> y = map.headMap("mohan", true);
        
        System.out.println(x);
        System.out.println(y);
    }
}
