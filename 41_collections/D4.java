class D4 {
    public static void main(String[] args) {
        Student s1 = new Student("mohan", 12);
        Student s2 = new Student("mohan", 12);
        Student s3 = new Student("mohan", 12);

        // Reflexive:
        // System.out.println(s1.equals(s1));
        // System.out.println(s2.equals(s2));
        
        // Symmetric:
        // System.out.println(s1.equals(s2));
        // System.out.println(s2.equals(s1));
        
        // Transitive:
        // System.out.println(s1.equals(s2));
        // System.out.println(s2.equals(s3));
        // System.out.println(s3.equals(s1));
        
        // Consistent:
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s2));
        
        // Null test:
        System.out.println(s1.equals(null));
        System.out.println(s2.equals(null));
        System.out.println(s3.equals(null));
    }    
}


// Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "<local3>" is null
//         at Student.equals(Student.java:19)
//         at D4.main(D4.java:27)
