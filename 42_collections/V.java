import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;

class V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter:\n1 for NameAsc\n2 for NameDsc\n3 for AgeAsc\n4 for AgeDsc: ");
        int input = sc.nextInt();

        Comparator comp = null;
        if(input == 1) 
            comp = new NameAsc();
        else if(input == 2) 
            comp = new NameDsc();
        else if(input == 3) 
            comp = new AgeAsc();
        else if(input == 4) 
            comp = new AgeDsc();
        else
            System.exit(0);

        //Integer(Rank)
        TreeMap<User,Integer> map = new TreeMap<User,Integer>(comp);
        
        map.put(new User("om",23), 5);
        map.put(new User("golu",9), 3);
        map.put(new User("raju",5), 1);
        map.put(new User("kaliya",10), 2);
        map.put(new User("dholu",6), 9);

        System.out.println(map);
    }
}

class AgeAsc implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((User)o1).age.compareTo(((User)o2).age);
    }
}

class NameAsc implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((User)o1).name.compareTo(((User)o2).name);
    }
}

class AgeDsc implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((User)o2).age.compareTo(((User)o1).age);
    }
}

class NameDsc implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((User)o2).name.compareTo(((User)o1).name);
    }
}