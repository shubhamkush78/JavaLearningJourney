class H {
    public static void main(String[] args) {
        Student[] x = new Student[3];

        x[0] = new Student("om", 23);
        x[1] = new Student("ram", 10);
        x[2] = new Student("ching", 9);

        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[1].name);
        System.out.println(x[1].age);
    }    
}
