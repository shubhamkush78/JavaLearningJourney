import java.util.Comparator;

class NameDscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.name.compareTo(s1.name);
    }
}