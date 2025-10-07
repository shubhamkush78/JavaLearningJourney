import java.util.Arrays;

class Y2 {
    public static void main(String[] args) {
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
        Arrays.sort(x);
        
        for(int i=0;i<x.length;i++)
            System.out.print(x[i] + " ");
    }       
}



// om-17 jay-7 ram-15 golu-5 raju-10
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1041)
//         at Y2.main(Y2.java:17)