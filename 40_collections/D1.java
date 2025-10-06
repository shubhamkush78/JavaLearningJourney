class D1 {
    public static void main(String[] args) {
        Student a = new Student("om", 12);
        // Student b = new Student("om", 12);
        Student b = a;

        System.out.println(a == b);
    }    
}
