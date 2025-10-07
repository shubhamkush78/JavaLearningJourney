import java.util.TreeMap;
import java.util.Comparator;

class U1 {
    public static void main(String[] args) {
        //Integer(Rank)
        TreeMap<User,Integer> map = new TreeMap<User,Integer>(new AgeSort());
        
        map.put(new User("om",23), 5);
        map.put(new User("golu",9), 3);
        map.put(new User("raju",5), 1);
        map.put(new User("kaliya",10), 2);
        map.put(new User("dholu",6), 9);

        System.out.println(map);
    }
}

class AgeSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((User)o1).age.compareTo(((User)o2).age);
    }
}