import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Z2 {
    public static void main(String... args) {
        Student[] x = { 
                        new Student("om", 17),
                        new Student("jay", 7),
                        new Student("ram", 15),
                        new Student("golu", 5),
                        new Student("raju", 10),
                      };
        
        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");

        System.out.println();
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

        Arrays.sort(x, comp);
        
        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");
        
        System.out.println();

        Student s = new Student("golu", 5);
        int searchIndex = Arrays.binarySearch(x, s, comp);

        System.out.println(searchIndex);
    }       
}
