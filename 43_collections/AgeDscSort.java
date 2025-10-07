import java.util.Comparator;

class AgeDscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.age.compareTo(s1.age);
    }
}