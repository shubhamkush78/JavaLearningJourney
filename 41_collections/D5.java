class D5 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("mohan", 12);
        Student1 s2 = new Student1("mohan", 12);
        Student1 s3 = new Student1("mohan", 12);

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
