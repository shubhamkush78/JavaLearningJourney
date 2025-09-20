class Student5 {
    String name;
    int age;

    public static void main(String[] args) {
        Student5 x = new Student5();
        x.name = "mohan";
        x.age = 16;

        Student5 y = new Student5();
        y.name = "ramesh";
        y.age = 17;

        showInfo();
    }
    void showInfo() {
        System.out.println(name);
        System.out.println(age);

    }
}

// F.java:14: error: non-static method showInfo() cannot be referenced
//  from a static context
//         showInfo();
//         ^
// 1 error