import java.util.HashMap;

class X {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        
        map.put("mohan", 12);
        map.put("sohan", 23);
        map.put("rohan", 9);
        map.put("gohan", 15);
        map.put("tohan", 8);

        System.out.println(map);
        
        map.put("mohan", 100);
        
        System.out.println(map);
    }
}
