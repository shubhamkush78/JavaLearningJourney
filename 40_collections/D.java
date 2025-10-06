class D {
    public static void main(String[] args) {
        Student a = new Student("om", 12);
        Student b = new Student("om", 12);

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }    
}
