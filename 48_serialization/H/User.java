import java.io.Serializable;

class User /*implements Serializable*/ {
    String name;
    int age;

    User() {
        
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}