import java.util.HashMap;

class V {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        
        map.put("mohan", 12);
        map.put("sohan", 23);
        map.put("rohan", 9);
        map.put("gohan", 15);
        map.put("tohan", 8);
        
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
