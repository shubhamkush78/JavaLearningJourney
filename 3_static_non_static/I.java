class Student {
    String name;
    int age;

    int maxAge = 20;

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "mohan";
        x.age = 16;

        Student y = new Student();
        y.name = "ramesh";
        y.age = 17;

        System.out.println(x.name);
        System.out.println(x.age);  
        System.out.println(x.maxAge);
        System.out.println(y.name);
        System.out.println(y.age);
        System.out.println(y.maxAge);

    } 
}