import java.util.TreeMap;

class N {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        
        map.put("mohan", 12);
        map.put("sohan", 23);
        map.put("rohan", 9);
        map.put("gohan", 15);
        map.put("tohan", 8);

        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
