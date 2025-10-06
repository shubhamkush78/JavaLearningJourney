class E1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("mohan", 12);
        Employee s2 = new Employee("mohan", 12);
        
        System.out.println(s2.equals(s1));
    }    
}


// Exception in thread "main" java.lang.ClassCastException: class Student1 cannot be cast to class Employee (Student1 and Employee are in unnamed module of loader 'app')
//         at Employee.equals(Employee.java:19)
//         at E1.main(E1.java:6)
