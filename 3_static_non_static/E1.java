class Student3 {
    String name;
    int age;

    public static void main(String[] args) {
        Student3 x = new Student3();
        x.name = "mohan";
        x.age = 16;

        Student3 y = new Student3();
        y.name = "ramesh";
        y.age = 17;

        x.showInfo();
        y.showInfo();

    }

    void showInfo() {
        System.out.println(name);
        System.out.println(age);

    }
}