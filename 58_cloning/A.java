class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class A {
    public static void main(String[] args) {
        Student x = new Student("yudhishthir", 23);

        //Shallow cloning:
        Student y = x;

        System.out.println("----- Before ------");
        System.out.println(x.name + " - " + x.age);
        System.out.println(y.name + " - " + y.age);
        
        y.name = "bheem";
        y.age = 21;
        
        System.out.println("----- After ------");
        System.out.println(x.name + " - " + x.age);
        System.out.println(y.name + " - " + y.age);
    }
}