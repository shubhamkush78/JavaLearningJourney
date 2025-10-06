class E {
    public static void main(String[] args) {
        Student1 s1 = new Student1("mohan", 12);
        Employee s2 = new Employee("mohan", 12);

        System.out.println(s1.equals(s2));
    }    
}


// Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class Student1 (Employee and Student1 are in unnamed module of loader 'app')
//         at Student1.equals(Student1.java:19)
//         at E.main(E.java:6)