import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;

class W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter:\n1 for NameAsc\n2 for NameDsc\n3 for AgeAsc\n4 for AgeDsc: ");
        int input = sc.nextInt();

        sc.close();

        Comparator<User> comp = null;
        if(input == 1) 
            comp = new NameAsc1();
        else if(input == 2) 
            comp = new NameDsc1();
        else if(input == 3) 
            comp = new AgeAsc1();
        else if(input == 4) 
            comp = new AgeDsc1();
        else
            System.exit(0);

        //Integer(Rank)
        TreeMap<User,Integer> map = new TreeMap<User,Integer>(comp);
        
        map.put(new User("om",23), 5);
        map.put(new User("golu",9), 3);
        map.put(new User("raju",5), 1);
        map.put(new User("kaliya",10), 2);
        map.put(new User("dholu",6), 9);
        map.put(new User("golu",9), 3);

        System.out.println(map);
    }
}

class AgeAsc1 implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o1.age.compareTo(o2.age);
    }
}

class NameAsc1 implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeDsc1 implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o2.age.compareTo(o1.age);
    }
}

class NameDsc1 implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o2.name.compareTo(o1.name);
    }
}