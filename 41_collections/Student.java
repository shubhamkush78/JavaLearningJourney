class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        Student u1 = this;
        Student u2 = (Student)obj;

        String nm1 = u1.name;
        String nm2 = u2.name;

        return nm1.equals(nm2);
    }
}
