import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("mohan", 12));
        students.add(new Student("sohan", 16));
        students.add(new Student("rohan", 10));
        students.add(new Student("tohan", 9));
        students.add(new Student("gohan", 15));

        Student s = new Student("tohan", 9);
        System.out.println(students);

        boolean huaKya = students.remove(s);
        System.out.println(huaKya);
        
        System.out.println(students);
    }    
}


