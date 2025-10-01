class N {
    public static void main(String[] args) {
        System.out.println("aa"+2);
        System.out.println("aa"+2.23);
        System.out.println("aa"+true);
        System.out.println("aa"+null);
        System.out.println(true+"aa");
        System.out.println(34+"aa");
        Student x = new Student("raju", 2);
        System.out.println("aa"+x);
        String y = null;
        System.out.println(y + null);
        int[] z = {12, 34};
        System.out.println("aa"+z);
        System.out.println("aa"+z.toString());
        Employee m = new Employee("kaliya", 10);
        System.out.println("aa"+m);
    }    
}

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+"-"+age;
    }
}
