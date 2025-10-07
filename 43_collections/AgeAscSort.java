import java.util.Comparator;

class AgeAscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age.compareTo(s2.age);
    }
}