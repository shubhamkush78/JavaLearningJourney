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

    }

    void showInfo() {
        System.out.println(x.name);
        System.out.println(x.age);

    }
}

// E.java:19: error: cannot find symbol
//         System.out.println(x.name);
//                            ^
//   symbol:   variable x
//   location: class Student3
// E.java:20: error: cannot find symbol
//         System.out.println(x.age);
//                            ^ 
//   symbol:   variable x
//   location: class Student3   
// 2 errors
