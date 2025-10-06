import java.util.HashMap;

class W2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        System.out.println(map);
        
        map.put(12, "mohan");
        
        //not ok
        // map.put(12, true);
        // map.put(2.3, "sohan");
                
        System.out.println(map);
    }
}
