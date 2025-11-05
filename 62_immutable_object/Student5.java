// Immutable class

//Step 1: immutable class must be declared final
//Step 2: all the variables must be declare 'private final'
//Step 3: initialize such final variables inside the constructors
//Step 4: remove all the setters from immutable class

final class Student5 {
    private final String name;
    private final int age;

    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public int getAge() {
        return age;
    }

    // public void setAge(int age) {
    //     this.age = age;
    // }    
}