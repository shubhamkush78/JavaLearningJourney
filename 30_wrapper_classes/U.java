class Student {
    String name;
    int age;
}

class U {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "om";
        x.age = 12;

        Student y = new Student();
        y.name = "om";
        y.age = 12;

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
