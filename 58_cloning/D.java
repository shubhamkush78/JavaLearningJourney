class Student3 {
    String name;
    int age;
}

class D {
    public static void main(String[] args) {
        Student3 x = new Student3();
        x.name = "gopal";
        x.age = 21;

        Student3 y = (Student3)x.clone();
    }
}



// D.java:12: error: clone() has protected access in Object
//         Student3 y = (Student3)x.clone();