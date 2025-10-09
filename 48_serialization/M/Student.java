import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

class Student implements Serializable {
    String name;
    int age;
    transient Address address;
    
    Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeObject(address.city.cityName);
            oos.writeObject(address.state.stateName);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            City ct = new City((String)ois.readObject());
            State st = new State((String)ois.readObject());
            address = new Address(ct, st);
        } catch(ClassNotFoundException|IOException e) {
            e.printStackTrace();
        }
    }
}
