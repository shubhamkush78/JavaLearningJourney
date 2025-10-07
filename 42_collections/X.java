import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter:\n1 for NameAsc\n2 for NameDsc\n3 for AgeAsc\n4 for AgeDsc: ");
        int input = sc.nextInt();

        sc.close();

        Comparator<User> comp = null;
        if(input == 1) 
            comp = new NameAsc2();
        else if(input == 2) 
            comp = new NameDsc2();
        else if(input == 3) 
            comp = new AgeAsc2();
        else if(input == 4) 
            comp = new AgeDsc2();
        else
            System.exit(0);

        //Integer(Rank)
        PriorityQueue<User> queue = new PriorityQueue<User>(comp);
        
        queue.offer(new User("om",23));
        queue.offer(new User("golu",9));
        queue.offer(new User("raju",5));
        queue.offer(new User("kaliya",10));
        queue.offer(new User("dholu",6));
        queue.offer(new User("golu",9));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

class AgeAsc2 implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o1.age.compareTo(o2.age);
    }
}

class NameAsc2 implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeDsc2 implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o2.age.compareTo(o1.age);
    }
}

class NameDsc2 implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o2.name.compareTo(o1.name);
    }
}