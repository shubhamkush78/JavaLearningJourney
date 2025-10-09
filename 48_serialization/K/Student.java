import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    // transient Address address;
    XAddress address;
    
    Student(String name, int age, XAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
