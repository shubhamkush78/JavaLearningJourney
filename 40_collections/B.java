import java.util.ArrayList;

class B {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("mohan", 12));
        students.add(new Student("sohan", 16));
        students.add(new Student("rohan", 10));
        students.add(new Student("tohan", 9));
        students.add(new Student("gohan", 15));

        System.out.println(students.size());
        System.out.println(students.isEmpty());
        
        System.out.println(students);
    }    
}


