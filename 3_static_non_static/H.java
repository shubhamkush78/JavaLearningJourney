class Student8 {
    static String name;
    static int age;

    public static void main(String[] args) {
        Student8 x = new Student8();
        x.name = "mohan";
        x.age = 16;

        Student8 y = new Student8();
        y.name = "ramesh";
        y.age = 17;

        showInfo();
        showInfo();
    }
    static void showInfo() {
        System.out.println(name);
        System.out.println(age);

    }
 }