// Immutable class

//Step 1: immutable class must be declared finals
//Step 2: all the variables must be declare 'private final'
//Step 3: initialize such final variables inside the constructors

final class Student3 {
    private final String name;
    private final int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
}