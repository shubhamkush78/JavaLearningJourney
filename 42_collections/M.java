import java.util.HashMap;

class M {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("mohan",23);
        map.put("raghav",null);
        map.put(null,14);
        map.put("viraj",9);

        System.out.println(map);
        
        map.put(null,27);

        System.out.println(map);
    }
}
