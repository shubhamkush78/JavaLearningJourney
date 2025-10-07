import java.util.Hashtable;

class N {
    public static void main(String[] args) {
        Hashtable<String,Integer> map = new Hashtable<String,Integer>();

        map.put("mohan",23);
        map.put("raghav",null);
        map.put("viraj",9);

        System.out.println(map);
    }
}


// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.Hashtable.put(Hashtable.java:476)
//         at N.main(N.java:8)
