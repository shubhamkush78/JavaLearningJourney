class D2 {
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
        
        // transitive:
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));
        
    }    
}
