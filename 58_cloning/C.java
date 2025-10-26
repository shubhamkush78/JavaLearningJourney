class Student2 {
    String name;
    int age;
}

class C {
    public static void main(String[] args) {
        Student2 x = new Student2();
        x.name = "paramveer";
        x.age = 32;

        Student2 y = x.clone();
    }    
}

// C.java:12: error: incompatible types: Object cannot be converted to Student2
//         Student2 y = x.clone();
