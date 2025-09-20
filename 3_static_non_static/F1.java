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
     static void showInfo() {
        System.out.println(name);
        System.out.println(age);

    }
}


// F1.java:17: error: non-static variable name cannot be referenced 
// from a static context
//         System.out.println(name);
//                            ^
// F1.java:18: error: non-static variable age cannot be referenced 
// from a static context
//         System.out.println(age);
//                            ^
// 2 errors