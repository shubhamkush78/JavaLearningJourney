import java.util.HashMap;
import java.util.Set;

class F {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("mohan", 12);
        map.put("sohan", 23);
        map.put("rohan", 9);
        map.put("gohan", 15);
        map.put("tohan", 8);

        System.out.println(map);

        Set<String> keys = map.keySet();
        
        for(String key : keys) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}