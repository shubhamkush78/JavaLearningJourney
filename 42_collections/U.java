import java.util.TreeMap;

class U {
    public static void main(String[] args) {
        //Integer(Rank)
        TreeMap<User,Integer> map = new TreeMap<User,Integer>();
        
        map.put(new User("om",23), 5);
        map.put(new User("golu",9), 3);
        map.put(new User("raju",5), 1);
        map.put(new User("kaliya",10), 2);
        map.put(new User("dholu",6), 9);

        System.out.println(map);
    }
}


// Exception in thread "main" java.lang.ClassCastException: class User cannot be cast to class java.lang.Comparable (User is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at U.main(U.java:8)
