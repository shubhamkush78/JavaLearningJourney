import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;

class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for NameAsc\n2 for NameDsc\n3 for AgeAsc\n4 for AgeDsc: ");
        int input = sc.nextInt();

        Comparator<Client> x = null;
        
        switch(input) {
            case 1:
                x = new NameAsc1();
                break;
            case 2:
                x = new NameDsc1();
                break;
            case 3:
                x = new AgeAsc1();
                break;
            case 4:
                x = new AgeDsc1();
                break;
            default: 
                System.out.println("Invalid input!!!");
                System.exit(0);
        }

        TreeSet<Client> set = new TreeSet<Client>(x);

        set.add(new Client("gopal", 34));
        set.add(new Client("vijay", 23));
        set.add(new Client("ekta", 45));
        set.add(new Client("dinesh", 56));
        set.add(new Client("vijay", 23));
        set.add(new Client("manoj", 28));

        System.out.println(set);

        sc.close();
    }
}

class NameAsc1 implements Comparator<Client> {
    public int compare(Client o1, Client o2) {
        // //name asc
        // Client c1 = (Client)o1;
        // Client c2 = (Client)o2;

        // String nm1 = c1.name;
        // String nm2 = c2.name;

        return o1.name.compareTo(o2.name);
    }
}

class NameDsc1 implements Comparator<Client> {
    public int compare(Client o1, Client o2) {
        //name dsc
        // Client c1 = (Client)o1;
        // Client c2 = (Client)o2;

        // String nm1 = c1.name;
        // String nm2 = c2.name;

        return o2.name.compareTo(o1.name);
    }
}

class AgeAsc1 implements Comparator<Client> {
    public int compare(Client o1, Client o2) {
        //age asc
        // Client c1 = (Client)o1;
        // Client c2 = (Client)o2;

        // Integer ag1 = c1.age;
        // Integer ag2 = c2.age;

        return o1.age.compareTo(o2.age);
    }
}

class AgeDsc1 implements Comparator<Client> {
    public int compare(Client o1, Client o2) {
        return o2.age.compareTo(o1.age);
    }
}
