import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for NameAsc\n2 for NameDsc\n3 for AgeAsc\n4 for AgeDsc: ");
        int input = sc.nextInt();

        Comparator x = null;
        
        switch(input) {
            case 1:
                x = new NameAsc();
                break;
            case 2:
                x = new NameDsc();
                break;
            case 3:
                x = new AgeAsc();
                break;
            case 4:
                x = new AgeDsc();
                break;
            default: 
                System.out.println("Invalid input!!!");
                System.exit(0);
        }

        PriorityQueue<Client> queue = new PriorityQueue<Client>(x);

        queue.offer(new Client("gopal", 34));
        queue.offer(new Client("vijay", 23));
        queue.offer(new Client("ekta", 45));
        queue.offer(new Client("dinesh", 56));
        queue.offer(new Client("vijay", 23));
        queue.offer(new Client("manoj", 28));

        System.out.println(queue);

        System.out.print(queue.poll() + "   ");
        System.out.print(queue.poll() + "   ");
        System.out.print(queue.poll() + "   ");
        System.out.print(queue.poll() + "   ");
        System.out.print(queue.poll() + "   ");
        System.out.print(queue.poll() + "   ");

        sc.close();
    }
}

class NameAsc implements Comparator {
    public int compare(Object o1, Object o2) {
        //name asc
        Client c1 = (Client)o1;
        Client c2 = (Client)o2;

        String nm1 = c1.name;
        String nm2 = c2.name;

        return nm1.compareTo(nm2);
    }
}

class NameDsc implements Comparator {
    public int compare(Object o1, Object o2) {
        //name dsc
        Client c1 = (Client)o1;
        Client c2 = (Client)o2;

        String nm1 = c1.name;
        String nm2 = c2.name;

        return nm2.compareTo(nm1);
    }
}

class AgeAsc implements Comparator {
    public int compare(Object o1, Object o2) {
        //age asc
        Client c1 = (Client)o1;
        Client c2 = (Client)o2;

        Integer ag1 = c1.age;
        Integer ag2 = c2.age;

        return ag1.compareTo(ag2);
    }
}

class AgeDsc implements Comparator {
    public int compare(Object o1, Object o2) {
        //age dsc
        Client c1 = (Client)o1;
        Client c2 = (Client)o2;

        Integer ag1 = c1.age;
        Integer ag2 = c2.age;

        return ag2.compareTo(ag1);
    }
}
