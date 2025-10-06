import java.util.HashSet;

class S {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();

        students.add(new Student("om", 12));
        students.add(new Student("ram", 10));
        students.add(new Student("shyam", 14));
        students.add(new Student("ghanshyam", 20));
        students.add(new Student("khatushyam", 5));

        System.out.println(students);
    }
}
