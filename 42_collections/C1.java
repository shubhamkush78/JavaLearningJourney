import java.util.HashMap;

class C1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("mohan", 12);
        map.put("sohan", 23);
        map.put("rohan", 9);
        map.put("gohan", 15);
        map.put("tohan", 8);

        System.out.println(map);

        System.out.println(map.get("chetan"));

        System.out.println(map);        
    }
}