import java.io.Serializable;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            oos.defaultWriteObject();
            oos.writeObject(address.city);
            oos.writeObject(address.state);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            System.out.println("###############################");
            ois.defaultReadObject();
            address = new Address();
            address.city = (String)ois.readObject(); 
            address.state = (String)ois.readObject(); 
        } catch(ClassNotFoundException|IOException e) {
            e.printStackTrace();
        }
    }
}
