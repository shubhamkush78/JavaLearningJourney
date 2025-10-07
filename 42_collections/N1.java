import java.util.Hashtable;

class N1 {
    public static void main(String[] args) {
        Hashtable<String,Integer> map = new Hashtable<String,Integer>();

        map.put("mohan",23);
        map.put(null,14);
        map.put("viraj",9);

        System.out.println(map);
    }
}
