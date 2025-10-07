class Student1 implements Comparable<Student1> {
    String name;
    Integer age;
    
    Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Student1 st) {
        return this.name.compareTo(st.name);
    }
}
