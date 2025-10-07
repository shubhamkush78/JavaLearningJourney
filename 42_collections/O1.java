import java.util.LinkedHashMap;

class O1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();

        map.put("mohan",23);
        map.put(null,4);
        map.put("viraj",9);

        System.out.println(map);
    }
}         
