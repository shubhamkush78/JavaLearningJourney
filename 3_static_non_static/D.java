class Student2 {
    String name;
    int age;

    public static void main(String[] args) {
        Student2 x = new Student2();
        x.name = "mohan";
        x.age = 12;

        Student2 y = new Student2();
        y.name ="sohan";
        y.age = 15;

        System.out.println(x.name);
        System.out.println(y.age);

    }
}