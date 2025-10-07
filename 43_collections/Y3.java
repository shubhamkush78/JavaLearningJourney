import java.util.Arrays;

class Y3 {
    public static void main(String[] args) {
        Student1[] x = { 
                        new Student1("om", 17),
                        new Student1("jay", 7),
                        new Student1("ram", 15),
                        new Student1("golu", 5),
                        new Student1("raju", 10),
                      };
        
        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");

        System.out.println();
        Arrays.sort(x);
        
        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");
    }       
}
