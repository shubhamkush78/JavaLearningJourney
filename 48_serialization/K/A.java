import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Student s = new Student("om", 9, new XAddress("Jbp", "MP"));
        // hint: the Address is not serializable

        try {
            FileOutputStream fos = new FileOutputStream("yam.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }    
}



// java.io.NotSerializableException: Address
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1197)
//         at java.base/java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1582)
//         at java.base/java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1539)
//         at java.base/java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1448)
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1191)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
//         at A.main(A.java:15)
