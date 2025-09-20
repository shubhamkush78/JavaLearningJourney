class Student7 {
    String name;
    int age;

    public static void main(String[] args) {
        Student7 x = new Student7();
        x.name = "mohan";
        x.age = 16;

        Student7 y = new Student7();
        y.name = "ramesh";
        y.age = 17;

        showInfo();

    }
        static void showInfo() {
            System.out.println(x.name);
            System.out.println(x.age);
    
        }
}

// G.java:18: error: cannot find symbol
//             System.out.println(x.name);
//                                ^
//   symbol:   variable x
//   location: class Student7
// G.java:19: error: cannot find symbol
//             System.out.println(x.age);
//                                ^
//   symbol:   variable x
//   location: class Student7
// 2 errors
