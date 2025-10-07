import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class X {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        
        list.add(new Student("om", 12));
        list.add(new Student("ram", 9));
        list.add(new Student("jay", 7));
        list.add(new Student("veeru", 15));
        list.add(new Student("raju", 17));
        list.add(new Student("golu", 11));

        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        System.out.print("Press\n1 for NameAsc\n2 for NameDsc\n3 for AgeAsc\n4 for AgeDsc: ");
        int input = sc.nextInt();
        sc.close();

        Comparator<Student> comp = null;

        if(input == 1) 
            comp = new NameAscSort();
        else if(input == 2) 
            comp = new NameDscSort();
        else if(input == 3) 
            comp = new AgeAscSort();
        else if(input == 4) 
            comp = new AgeDscSort();
        else
            System.exit(0);

        Collections.sort(list, comp);

        System.out.println(list);

        Student x = new Student("jay", 7);
        int searchIndex = Collections.binarySearch(list, x, comp);
        
        System.out.println(searchIndex);
    }
}