import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        Shape shape = new Shape(3,5,7);

        File file = new File("yamraj.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(shape);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


// java.io.NotSerializableException: Shape
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1197)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
//         at A.main(A.java:18)