class Student1 {
    String name;
    int age;
}

class B {
    public static void main(String[] args) {
        Student1 x = new Student1();
        x.name = "vijay";
        x.age = 32;

        //Deep Cloning
        Student1 y = new Student1();
        y.name = x.name;
        y.age = x.age;

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
