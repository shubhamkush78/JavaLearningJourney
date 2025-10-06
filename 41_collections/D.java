class D {
    public static void main(String[] args) {
        Student s1 = new Student("mohan", 12);
        Student s2 = new Student("mohan", 12);

        // Reflexive:
        System.out.println(s1.equals(s1));
        System.out.println(s2.equals(s2));
    }    
}
