import java.util.HashMap;

class Z {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        
        System.out.println(map.put("sohan", 23));
        System.out.println(map.put("mohan", 12));
        System.out.println(map.put("rohan", 9));
        System.out.println(map.put("gohan", 15));
        System.out.println(map.put("tohan", 8));

        System.out.println(map);
        
        System.out.println(map.put("mohan", 100));
        
        System.out.println(map);
    }
}
