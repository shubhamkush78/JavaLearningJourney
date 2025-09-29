class Student {
    String name;
    int age;
}

class J {
    public static void main(String[] args) {
        Student x = new Student();

        System.out.println(x.name);
        System.out.println(x.age);

        x.name = "yamraj";
        x.age = 1000;

        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~ ");

        System.out.println(x.name);
        System.out.println(x.age);
    }
}
